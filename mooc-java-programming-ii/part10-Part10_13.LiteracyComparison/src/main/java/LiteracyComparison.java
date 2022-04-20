
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args){
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((a, b) -> a[5].compareTo(b[5]))
                    .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].split(" ")[1].trim() + ", " + parts[5]));
        }
        catch(IOException error){
            System.out.println("Error: " + error.getMessage());
        }
    }
}
