package com.mado.userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = obj.nextLine();
        System.out.println("How old are you? ");
        int age = obj.nextInt();
        obj.nextLine();
        System.out.println("What is your favorite food? ");
        String food = obj.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        
    }
}
