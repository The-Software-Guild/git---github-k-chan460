
package com.kc.exercises.classes;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        int input;
        do{
            System.out.println("Please enter a number to choose your operation");
            System.out.println("The options are 1.Add, 2.Subtract, 3.Multiply, 4.Divide, 5.Exit");
            input = myscanner.nextInt();
            if(input == 5){
                break;
            }
            System.out.println("Enter first number: ");
            int a = myscanner.nextInt();
            System.out.println("Enter second number: ");
            int b = myscanner.nextInt();
            
            System.out.println();
            SimpleCalculator sc = new SimpleCalculator();
            if(input == 1){
                System.out.println("The result is = " + sc.add(a, b)+"\n");
            }
            else if(input == 2){
                System.out.println("The result is = " + sc.sub(a, b)+"\n");
            }
            else if(input == 3){
                System.out.println("The result is = " + sc.mult(a, b)+"\n");
            }
            else if(input == 4){
                System.out.println("The result is = " + sc.div(a, b)+"\n");
            }
        }while (input != 5);
        System.out.println("\nThank you for using SimpleCalculator");
    }
}
