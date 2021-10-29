package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Project Header
        // John Saunders
        // CISP 401
        // 9/4/21
        // Simple Calculator Assignment

        Scanner input1 = new Scanner(System.in);


        System.out.println("Please enter an Integer");
        int firstNum = input1.nextInt();
        System.out.println("Please enter another Integer");
        int secondNum = input1.nextInt();



        System.out.println("What do you want to do with these numbers? (+, -, *, /");
        String operator = input1.next();
        System.out.println(operator);

        int total = 0;
        if (Objects.equals(operator, "+")){
            total = firstNum + secondNum;
        }
        if (Objects.equals(operator, "-")){
            total = firstNum - secondNum;
        }

        if (Objects.equals(operator, "*")){
            total = firstNum * secondNum;
        }

        if (Objects.equals(operator, "/")){
            total = firstNum / secondNum;
        }

        System.out.println("The result is " + total);

    }
}
