package com.pluralsight;

    //in here I am defining the blueprint called Dice, and everything inside the {} belongs to this template
public class Dice {
    // fields (dice properties)
        private int sides;

    // constructor is taking the information from fields and is building the object with it
    public Dice (int sides) {
            this.sides = sides;
    }


    public int roll() {
        return (int)(Math.random() * sides) + 1;
    }
}
