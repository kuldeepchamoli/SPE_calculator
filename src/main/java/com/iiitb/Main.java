package com.iiitb;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public double squareRootFunc(int x){
        return Math.sqrt(x);
    }

    public long factorialFunc(int x){
        long result = 1;

        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }

        return result;
    }

    public double naturalLogFun(int x){
        return Math.log(x);
    }

    public long powerFunc(int x, int b){
        return (long) Math.pow(x,b);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        calculator sc = new calculator();
        boolean exitNow = false;
        while (!exitNow){
            System.out.println("Select Operation to be performed: \n"+
                    "1. Evaluate Square Root of the number sqrt(x) \n"+
                    "2. Evaluate Factorial of the number x! \n"+
                    "3. Evaluate Natural Log(base e) ln(x) \n"+
                    "4. Evaluate Power of the number x^b \n"+
                    "5. Enter any other value to exit!!\n");
            int operation = s.nextInt();
            switch (operation){
                case(1):
                    System.out.println("Enter the number: ");
                    int x = s.nextInt();
                    System.out.println("The square root is: "+ sc.squareRootFunc(x));
                    break;
                case (2):
                    System.out.println("Enter the number: ");
                    int x1 = s.nextInt();
                    System.out.println("The factorial is: "+ sc.factorialFunc(x1));
                    break;
                case (3):
                    System.out.println("Enter the number: ");
                    int x2 = s.nextInt();
                    System.out.println("The natural logarithm is: "+ sc.naturalLogFun(x2));
                    break;
                case (4):
                    System.out.println("Enter the number and the power: ");
                    int x3 = s.nextInt();
                    int x4 = s.nextInt();
                    System.out.println("The power value is: "+ sc.powerFunc(x3,x4));
                    break;
                default :
                    exitNow = true;
            }
        }
    }
}