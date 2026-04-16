package com.pluralsight;

public class Dice {
    // fields (dice properties)
        private int sides;

        public Dice (int sides) {
            this.sides = sides;
        }


    public int roll() {
        return (int)(Math.random() * sides) + 1;
    }
}
