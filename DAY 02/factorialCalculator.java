// Challenge 4: Factorial of a Number
// Task: Write a Java program to calculate the factorial of a given number using a loop.

import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for finding factorial:");
        int n=scanner.nextInt();
        int fact=1;
        if(n==0||n==1){
            System.out.println("Factorial of "+n+" is 1");
        }else{
            for(int i=1;i<=n;i++){
                fact*=i;
            }
           
            System.out.println("Factorial of "+n+" is "+ fact);
        }
    }
    
}
