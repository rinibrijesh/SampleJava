package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the first Number");
        int a = scanner.nextInt();

        System.out.println("Give the Second Number");
        int b = scanner.nextInt();

        System.out.println("Please type a message");
        String msg = scanner.next();


     //   int a = 10;
//        int b = 20;
        int addition = a + b;

       System.out.println(msg+" " +addition);

//      System.out.println("Add " +addition);

    }



}

