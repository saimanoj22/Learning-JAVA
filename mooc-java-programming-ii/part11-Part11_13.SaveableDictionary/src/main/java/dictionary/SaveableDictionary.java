package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
            this.dictionary.put(translation, words);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    public void delete(String word) {
        String translation = translate(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                add(word, translation);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error : " + e);
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter fileWriter = new PrintWriter(new File(file));
            ArrayList<String> check = new ArrayList<>();

            for (String key : this.dictionary.keySet()) {
                if (!check.contains(key)) {
                    String word = key;
                    String translation = this.dictionary.get(key);
                    check.add(word);
                    check.add(translation);
                    fileWriter.println(word + ":" + translation);
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            return false;
        }
        return true;
    }
}
