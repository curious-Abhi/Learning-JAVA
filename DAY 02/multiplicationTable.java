// Challenge 3: Multiplication Table
// Task: Write a Java program to print the multiplication table for a given number using a loop.

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for table generation :");
        int n = scanner.nextInt();
        System.out.println("Table of "+n+" is:\n");

        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }

        scanner.close();
    }
}
