import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }
    public ArrayList<String> translate(String word){
        if(!this.translations.containsKey(word)){
            return new ArrayList<>();
        }
        return this.translations.get(word);
    }
    public void remove(String word){
        if(this.translations.containsKey(word)){
            this.translations.get(word).clear();
        }
    }     
}
