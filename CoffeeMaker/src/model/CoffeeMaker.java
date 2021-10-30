package model;

import model.exceptions.*;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    private int timeSinceLastBrew;
    private int cups;

    public CoffeeMaker(){
        timeSinceLastBrew=0;
        cups=0;
    }

    // getters
    public int getTimeSinceLastBrew() {
        return timeSinceLastBrew;
    }
    public int getCupsRemaining() {
        return cups;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        return cups>0;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        timeSinceLastBrew=time;
    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: throw BeansAmountException, WaterException, sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water) throws BeansAmountException, WaterException {
        if(beans<2.4){
            throw new NotEnoughBeansException(beans);
        }
        if(beans>2.6){
            throw new TooManyBeansException(beans);
        }
        if(water<=14.75){
            throw new WaterException(water);
        }

        cups=20;
        timeSinceLastBrew=0;
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: throw StaleCoffeeException, NoCupsRemainingException, subtracts one cup from cups remaining
    public void pourCoffee() throws StaleCoffeeExeception, NoCupsRemainingException {
        if(cups==0){
            throw new NoCupsRemainingException();
        }
        if(timeSinceLastBrew>=60){
            throw new StaleCoffeeExeception(timeSinceLastBrew);
        }

        cups--;
    }


}
