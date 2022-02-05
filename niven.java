package com.company;

import java.util.Scanner;

public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check: ");
        int num = sc.nextInt();
        int n = num, sum = 0;
        while (n != 0) {
            int t = n % 10;
            n = n / 10;
            sum = sum + t;
        }
        if (num % sum == 0) {
            System.out.println("the number is niven number");
        } else {
            System.out.println("the number is not a niven number ");
        }
    }

}
