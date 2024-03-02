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
        System.out.println("6)Factorial");
        System.out.println("7)Natural logarithm");
        System.out.println("8)Power function");
        System.out.println("Please select an operation from above (between 1 to 8): ");
        try (Scanner s = new Scanner(System.in)) {

            int operation = s.nextInt();
            double num1, num2;

            switch (operation) {
                case 1:
                    System.out.println("Enter two numbers separated by space(s): ");
                    num1 = s.nextDouble();
                    num2 = s.nextDouble();
                    System.out.println("Result of addition: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers separated by space(s): ");

                    num1 = s.nextDouble();
                    num2 = s.nextDouble();
                    System.out.println("Result of subtraction: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers separated by space(s): ");

                    num1 = s.nextDouble();
                    num2 = s.nextDouble();
                    System.out.println("Result of multiplication: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers separated by space(s): ");

                    num1 = s.nextDouble();
                    num2 = s.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed");
                    } else {
                        System.out.println("Result of division: " + division(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    num1 = s.nextDouble();
                    System.out.println("Result of square-root: " + squareRoot(num1));
                    break;
                case 6:
                    System.out.println("Enter a number: ");
                    num1 = s.nextDouble();
                    System.out.println("Result of factorial: " + factorial(num1));
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    num1 = s.nextDouble();
                    System.out.println("Result of natual-logarithm: " + naturalLog(num1));
                    break;
                case 8:
                    System.out.println("Enter two numbers separated by space(s): ");
                    num1 = s.nextDouble();
                    num2 = s.nextDouble();
                    System.out.println("Result of num1^num2(power): " + power(num1, num2));
                    break;
                default:
                    System.out.println("Invalid input given while selecting operation. Exiting...");
            }

        } catch (Exception e) {
            System.out.println("Exception caught with msg: " + e.getMessage());
        }
    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }

    public static double division(double a, double b) throws Exception {
        if(b==0){
            System.out.println("Division by zero is not allowed");
            throw new Exception("Division by zero is not allowed");
        }else{
            return a/b;
        }
    }

    public static double squareRoot(double a){
        return Math.sqrt(a);
    }

    public static long factorial(double a){
        if (a < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long res = 1;
        for(int i=1; i<=a; i++){
            res *= i;
        }
        return res;
    }

    public static double naturalLog(double a){
        return Math.log(a);
    }

    public static double power(double a, double b){
        return Math.pow(a,b);
    }
}
