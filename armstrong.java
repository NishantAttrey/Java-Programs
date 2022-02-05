package com.nishant;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check ");
        int n = sc.nextInt();
        int num = n, l, sum = 0;
        while (num != 0) {
            int p = num % 10;
            num = num / 10;
            l = p * p * p;
            sum = sum + l;
        }
        if (sum == n) {
            System.out.println("the number is armstrong number");
        } else {
            System.out.println("the number is not a armstrong number");
        }
    }
}
