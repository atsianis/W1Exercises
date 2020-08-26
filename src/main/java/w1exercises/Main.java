package w1exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Write a program that calculates the factorial of a number n
//                (n!).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an integer");
        int n = scanner.nextInt();
        System.out.println("the factorial of "+n+" is: "+Algorithms.factorial(n));
//        2. Find the maximum value of n as int so that the calculated
//        output is valid.

    }

}
