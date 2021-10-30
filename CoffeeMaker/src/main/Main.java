package main;

import model.CoffeeMaker;
import model.exceptions.BeansAmountException;
import model.exceptions.NoCupsRemainingException;
import model.exceptions.StaleCoffeeExeception;
import model.exceptions.WaterException;

public class Main {

    public static void main(String[] args){
        // TODO: complete the implementation of Main
        successfullPath();

        unsuccessfulPath();
    }

    private static void unsuccessfulPath() {
        CoffeeMaker maker= new CoffeeMaker();

        try {
            maker.brew(1.6,10.00);
        } catch (BeansAmountException e) {
            System.out.println(e.getMessage());
        } catch (WaterException e) {
            System.out.println(e.getMessage());
        }

        try {
            maker.brew(2.4,14.75);
        } catch (BeansAmountException e) {
            System.out.println(e.getMessage());
        } catch (WaterException e) {
            System.out.println(e.getMessage());
        }

        try {
            maker.pourCoffee();
            maker.pourCoffee();
            maker.setTimeSinceLastBrew(60);
            maker.pourCoffee();
        } catch (StaleCoffeeExeception e) {
            System.out.println(e.getMessage());
        } catch (NoCupsRemainingException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void successfullPath() {
        //Success
        CoffeeMaker maker= new CoffeeMaker();

        try {
            maker.brew(2.6,14.75);
        } catch (BeansAmountException e) {
            System.out.println(e.getMessage());
        } catch (WaterException e) {
            System.out.println(e.getMessage());
        }

        try {
            maker.pourCoffee();
            maker.pourCoffee();
            maker.setTimeSinceLastBrew(1);
        } catch (StaleCoffeeExeception e) {
            System.out.println(e.getMessage());
        } catch (NoCupsRemainingException e) {
            System.out.println(e.getMessage());
        }
    }


}