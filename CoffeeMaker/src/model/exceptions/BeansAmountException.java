package model.exceptions;

public class BeansAmountException extends Exception{

    private double beans;

    public BeansAmountException(double beans){
        super("Buy more beans! Only " +beans + " of beans remaining.");
    }

    protected BeansAmountException(double beans, String message){
        super(message);
    }

    public double getBeans(){
        return  beans;
    }
}
