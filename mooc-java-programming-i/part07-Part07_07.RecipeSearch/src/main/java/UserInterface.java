import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private Recipe recipe;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner){
        this.scan = scanner;
        this.recipes = new ArrayList<Recipe>();
    }
    
    public void start(){
        storeFileData();
        printCommands();
        readChoices();
        
    }
    
    public void readChoices(){
        while(true){
            System.out.println("\nEnter command: ");
            String command = scan.nextLine();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("list")){
                printRecipes();
            }
            else if(command.equals("find name")){
                findByName();
            }
            else if(command.equals("find cooking time")){
                findByCookingTime();
            }
            else if(command.equals("find ingredient")){
                findByIngredients();
            }
        }
    }
    
    public void printRecipes(){
        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes){
            System.out.println(recipe);
        }
    }
    
    public void findByName(){
        System.out.println("Searched word: ");
        String search = scan.nextLine();
        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes){
            if(recipe.getName().contains(search)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByCookingTime(){
        System.out.println("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scan.nextLine());
        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes){
            if(recipe.getCookingTime() <= maxCookingTime){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredients(){
        System.out.println("Ingredient: ");
        String ingredient = scan.nextLine();
        System.out.println("\nRecipes:");
        for(Recipe recipe : this.recipes){
            if(recipe.checkIngredients(ingredient)){
                System.out.println(recipe);
            }
        }
    }
    
    public void storeFileData(){
        System.out.println("File to read: ");
        String fileName = scan.nextLine();
        
        int flag = 0;
        String name = "";
        int cookingTime = 0;
        ArrayList<String> ingredients = new ArrayList<String>();
        
        try(Scanner fileScan = new Scanner(Paths.get(fileName))){
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                if(flag == 0){
                    name = row;
                    flag++;
                }
                else if(flag == 1){
                    cookingTime = Integer.valueOf(row);
                    flag++;
                }
                else{
                    ingredients.add(row);
                    flag++;
                }
                if(row.equals("")){
                    this.recipes.add(new Recipe(name, cookingTime, new ArrayList<>(ingredients)));
                    ingredients.clear();
                    flag = 0;
                }
            }
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        this.recipes.add(new Recipe(name, cookingTime, ingredients));
    }
    
    public void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
