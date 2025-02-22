package model;

import java.util.List;

public class Order {

    private Dish dish;
    private int number;
    private boolean served;
    private boolean prepared;

    public Order(Dish dish, int orderNumber) {
        this.dish = dish;
        this.number = orderNumber;
    }

    //EFFECTS: prints this order with number, dish and any modifications
    public void print() {
        System.out.print("Order #" + number);

        System.out.print(" -> ");
        printNot(prepared);
        System.out.print("Prepared, ");
        printNot(served);
        System.out.println("Served");
    }

    //EFFECTS: returns the recipe to follow for this order
    public String getRecipe() {
        return dish.getRecipe();
    }

    //EFFECTS: returns a list of ingredients needed for this order
    public List<String> getIngredients() {
        return dish.getIngredients();
    }

    //getters
    public Dish getDish() {
        return dish;
    }

    public int getNumber() { return number; }

    public boolean isServed() {
        return served;
    }

    public boolean isPrepared() {
        return prepared;
    }

    //REQUIRES: dish != null
    //MODIFIES: this
    //EFFECTS: sets order's dish to given dish
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    //MODIFIES: this
    //EFFECTS: sets served to true
    public void setIsServed() {
        this.served = true;
    }

    //MODIFIES: this
    //EFFECTS: sets prepared to true
    public void setIsPrepared() {
        this.prepared = true;
    }

    //EFFECTS: returns true if this still needs to be prepared
    public boolean needsToBePrepared() {
        return !prepared;
    }

    //EFFECTS: returns true if this is cooked but not served
    public boolean isReadyToBeServed() {
        return prepared && !served;
    }

    //EFFECTS: returns true if this has been cooked and served
    public boolean isReadyToBePaid() {
        return prepared && served;
    }

    //EFFECTS: prints out "not" if status is false
    private void printNot(boolean status) {
        if (!status)
            System.out.print("Not ");
    }
}
