package com.jetbrains;
import java.util.Scanner;

public class FindingSquare {

    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scanner.nextInt();
        System.out.println("Enter the second number");
        int b= scanner.nextInt();

        int addition=a+b;
        System.out.println("The result is " +addition*addition);

    }
}
