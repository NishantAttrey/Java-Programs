package com.nishant;

import java.util.Scanner;

public class neon
{
    public static void main(String args[])
    {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        n = sc.nextInt();
        int square = n * n;
        while(square != 0)
        {
            int digit = square % 10;
//adds digits to the variable sum
            sum = sum + digit;
//removes the last digit of the variable square
            square = square / 10;
        }
//compares the given number (n) with sum
        if(n == sum)
            System.out.println(n + " is a Neon Number.");
        else
            System.out.println(n + " is not a Neon Number.");
    }
}

