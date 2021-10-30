package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {

    private String name;
    private String description;
    private String recipe;
    private List<String> ingredients;


    public Dish(String name){
        this.name=name;
        this.description = "";
        this.recipe="";
        this.ingredients=new ArrayList<>();
    }

    public Dish(String name, String description, String recipe, List<String> ingredients) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
