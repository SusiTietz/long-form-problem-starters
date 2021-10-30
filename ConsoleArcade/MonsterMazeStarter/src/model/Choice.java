package model;

public abstract class Choice {

    public Choice(String optionMessage){
        this.optionMessage=optionMessage;
    }

    private String optionMessage;

    //EFFECTS: prints a message representing this possible next choice
    public void printOptionMessage() {
        System.out.println(optionMessage);
    }

    public abstract void printOutcome();

}
