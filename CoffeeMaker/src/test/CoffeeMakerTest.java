package test;

import model.CoffeeMaker;
import model.exceptions.BeansAmountException;
import model.exceptions.NotEnoughBeansException;
import model.exceptions.TooManyBeansException;
import model.exceptions.WaterException;
import org.junit.Before;
import org.junit.Test;


public class CoffeeMakerTest {

    CoffeeMaker maker;

    @Before
    public void setUp(){
        maker = new CoffeeMaker();
    }

    @Test (expected = NotEnoughBeansException.class)
    public void testNotEnoughBeans() throws BeansAmountException, WaterException {
        maker.brew(2.3,14.75);

    }

    @Test (expected = TooManyBeansException.class)
    public void testTooManyBeans() throws BeansAmountException, WaterException {
        maker.brew(2.7,14.75);

    }

    @Test (expected = WaterException.class)
    public void testTooLittleWater() throws BeansAmountException, WaterException {

        maker.brew(2.4,10);

    }

}
