package com.nishant;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbers=input.nextInt();
        int temp=0;
        int ans=0;
        while(numbers>0){
            temp=numbers%10;

            numbers=numbers/10;

            ans=ans*10+temp;

        }
        System.out.println(ans);
    }
}
