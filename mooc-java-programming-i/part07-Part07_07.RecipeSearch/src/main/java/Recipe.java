import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public boolean checkIngredients(String ingredient){
        if(this.ingredients.contains(ingredient)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
