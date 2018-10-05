package com.jetbrains;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String []arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number to determine Even/Odd");
        int a =scanner.nextInt();

        if(a%2==0)
            System.out.println("The value entered is "+a+ " and it is an Even Number");
        else
            System.out.println("The value entered is "+a+ " and it is an Odd Number");


    }
}
