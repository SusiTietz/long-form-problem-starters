package model.exceptions;

public class StaleCoffeeExeception extends Exception {
     private int timeSinceLastBrew;

     public StaleCoffeeExeception(int timeSinceLastBrew){
         super("the coffee has gone stale. it has been " + timeSinceLastBrew + " since the last brew.");
     }
}
