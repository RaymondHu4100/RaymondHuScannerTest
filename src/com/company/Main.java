package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = input.nextLine();
        System.out.println("How are you " + name + "? May I ask for your age?");
        int age = input.nextInt();
        System.out.println(name + ", you are " + age + " years old. Wow!");
    }
}
