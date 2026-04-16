package com.pluralsight;

public class DiceProgram {
    public static void main(String[] args) {
//      creates an instance of Dice object called dice
        Dice dice = new Dice(6);

//      created integer variables
        int roll1 = 0;
        int roll2 = 0;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;


//      Created a loop that executes 100 times and called my dice's roll() 2x
        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.printf("%nRoll 1: %d - %d Sum: %d%n", roll1, roll2, sum);



        }













    }
}
