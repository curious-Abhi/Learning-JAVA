// Challenge 2: Sum of Natural Numbers
// Task: Write a Java program to calculate the sum of the first n natural numbers using a loop.

import java.util.Scanner;

public class sumofNatural {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter the length of natural number");
  int n=scanner.nextInt();
  int sum=0;
  //now use loop to iterate over entered length
  for(int i=1;i<=n;i++){
       sum+=i;

  }
  System.out.println("sum of first "+n+"th natural number is: "+sum );
}    
}
