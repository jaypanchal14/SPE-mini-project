package com.spe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpeMiniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeMiniProjectApplication.class, args);
        System.out.println("Available operations in our calculator:");
        System.out.println("1)Addition");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");
        System.out.println("5)Square-root");
        System.out.println("6)Modulo");
        System.out.println("Please select an operation from above (between 1 to 6): ");

        Scanner s = new Scanner(System.in);

        int operation = s.nextInt();
        double num1, num2;

        switch(operation){
            case 1:
                System.out.println("Enter two numbers separated by space(s): ");
                num1 = s.nextDouble();
                num2 = s.nextDouble();
                System.out.println("Result of addition: "+(num1+num2));
                break;
            case 2:
                System.out.println("Enter two numbers separated by space(s): ");

                num1 = s.nextDouble();
                num2 = s.nextDouble();
                System.out.println("Result of subtraction: "+(num1-num2));
                break;
            case 3:
                System.out.println("Enter two numbers separated by space(s): ");

                num1 = s.nextDouble();
                num2 = s.nextDouble();
                System.out.println("Result of multiplication: "+(num1*num2));
                break;
            case 4:
                System.out.println("Enter two numbers separated by space(s): ");

                num1 = s.nextDouble();
                num2 = s.nextDouble();
                if(num2 == 0){
                    System.out.println("Division by zero is not allowed");
                }else{
                    System.out.println("Result of division: "+(num1/num2));
                }
                break;
            case 5:
                System.out.println("Enter a number:");
                num1 = s.nextDouble();
                System.out.println("Result of square-root: "+Math.sqrt(num1));
                break;
            case 6:
                System.out.println("Enter two numbers separated by space(s): ");

                num1 = s.nextDouble();
                num2 = s.nextDouble();
                if(num2 == 0){
                    System.out.println("Division by zero is not allowed.");
                }else {
                    System.out.println("Result of Modulo: " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid input given while selecting operation. Exiting...");
                //break;
        }
        s.close();
    }
}
