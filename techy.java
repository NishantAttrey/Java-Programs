package com.company;

import java.util.Scanner;

public class techy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int n = num, n1 = num, s = 0, t = 0, len = 0;
        while (n != 0) {
            n = n / 10;
            len++;
        }
        if (len % 2 == 0) {
            t = n1 % (int) Math.pow(10, len / 2);
            n1 = n1 / (int) Math.pow(10, len / 2);
            s = (t + n1) * (t + n1);
            if (s==num)
            {
                System.out.println("the number is tech number");
            }
            else
            {
                System.out.println("the number is not a tech number");
            }
        }
        else
        {
            System.out.println("the number is not a tech number");
        }
    }
}

