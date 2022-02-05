package com.company;

import java.util.Scanner;

public class disarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter the number you want to check: ");
        int num=sc.nextInt();
        int n=num,lnum=num,len=0, sum=0;
        while (lnum!=0)
        {
            lnum=lnum/10;
            len++;
        }

        while (n!=0)
        {
            int p=n%10;
            n=n/10;
            int p1=(int)Math.pow(p,len);
            sum=sum+p1;
            len--;
        }
        if (sum==num)
        {
            System.out.println("the number you entered is disarium number");
        }
        else
        {
            System.out.println("the number you entered is not a disarium number");
        }
    }
}
