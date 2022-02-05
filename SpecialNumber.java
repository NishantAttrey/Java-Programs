package com.company;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=n;
        //taking out factorial
        int i,j,l;
        int t=0;
        while(num!=0)
        {
            int p=1;
            j=num%10;
            num=num/10;
            for(i=1;i<=j;i++){
                p=p*i;
            }
            t=t+p;

        }
        if (t==n){
            System.out.println("this is a special number");
        }
        else{
            System.out.println("this is not a special number");
        }

    }
}
