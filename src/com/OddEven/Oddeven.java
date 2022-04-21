package com.OddEven;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        System.out.print("Gimme a number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if(n % 2 == 0)
        {
            System.out.println(n + " is Even.");
        }
        else
        {
            System.out.println(n + " is Odd.");
        }
    }
}