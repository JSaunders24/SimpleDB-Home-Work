package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program Header
        // Saunders, John
        // CISP 401
        // Dice Roller HW

        // First Roll

//        Random rand = new Random();
//        int theRoll = rand.nextInt(6) + 1;
//        System.out.println(theRoll);

        // V2 Roll 2 Dice

//        int total;
//        Random rand1 = new Random();
//        Random rand2 = new Random();
//        int die1 = rand1.nextInt(6) + 1;
//        int die2 = rand2.nextInt(6) + 1;
//        total = die1 + die2;
//        System.out.println("You rolled " + die1 + " and " + die2 + " for a total of " + total + "!");
//        if (die1 == die2) {
//            System.out.println("You got Doubles!");
//        }

        //V3 Lots of Dice
//        int total = 0;
//        int[] dice = new int[5];
//        for (int i = 0; i < 5; i++) {
//            Random rand = new Random();
//            dice[i] = rand.nextInt(6) + 1;
//        }
//
//        String msg = "";
//        for (int j = 0; j < dice.length; j++) {
//            msg += "You rolled a " + dice[j] + " \n";
//            System.out.println(msg);
//            total += dice[j];
//        }
//
//        System.out.println("Your total is " + total);

        //V4 Enhanced for Loop
//        int total = 0;
//        int[] dice = new int[6];
//        for (int i = 0; i < 6; i++) {
//            Random rand = new Random();
//            dice[i] = rand.nextInt(6) + 1;
//        }
//
//        String msg = "";
//        for(int die: dice){
//            msg += "You rolled a " + die + " \n";
//            System.out.println(msg);
//            total += die;
//        }
//
//        System.out.println("Your total is " + total);

        // V5 Prompt for the # of Sides
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many die do you want to roll? ");
//        int numDie = input.nextInt();
//        int total = 0;
//        int[] dice = new int[numDie];
//
//        for (int i = 0; i < numDie; i++) {
//            Random rand = new Random();
//            dice[i] = rand.nextInt(6) + 1;
//        }
//
//        String msg = "";
//        for (int die: dice) {
//            msg += "You rolled a " + die + " \n";
//            System.out.println(msg);
//            total += die;
//        }
//
//        System.out.println("Your total is " + total);


        // V6 Prompt the # of sides

        Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the die you want to roll?");
        int numSides = input.nextInt();
        int total = 0;
        // go back to rolling 5 dice
        int[] dice = new int[5];

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        String msg = "";
        for (int die: dice) {
            msg += "You rolled a " + die + " on a " + numSides + " sided dice \n";
            System.out.println(msg);
            total += die;
        }

        System.out.println("Your total is " + total);








    }
}
