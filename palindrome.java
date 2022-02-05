package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number you want to check: ");
        int num= sc.nextInt();
        int n=num, sum=0;
        while(n!=0)
        {
            int p=n%10;
            n=n/10;
           sum=(sum*10)+p;
        }
        if (sum==num)
        {
            System.out.println("the number you entered is palindrome number");
        }
        else
        {
            System.out.println("the number you entered is not a palindrome number");
        }
    }
}

