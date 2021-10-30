package model.exceptions;

public class WaterException extends Exception{

    private double water;

    public WaterException(double water){

        super("Add more water! Only " + water + " cups remaining.");
    }

    protected WaterException(double beans, String message){
        super(message);
    }

    public double getWater(){
        return  water;
    }
}
