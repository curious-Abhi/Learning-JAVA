// Challenge 1: Even or Odd
// Task: Write a Java program that checks if a number is even or odd.
// Hint: Use the modulus operator % to check the remainder when dividing by 2.


import java.util.Scanner;
public class evenoddChecker {
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter any number");
    int number=scanner.nextInt();

    if(number%2==0){
        System.out.println(number +" is even");
    }else{
        System.out.println(number +" is odd");
    }
    scanner.close();
    
}    
}
