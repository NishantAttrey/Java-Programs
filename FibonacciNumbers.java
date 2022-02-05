package com.nishant;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N=n.nextInt();
       int c=2;
        int s1=0;
        int s2=1;
        System.out.print("0,1,");
        while(c<=N){
            int total=(s1+s2);
            System.out.print(total+',');
         /*  int temp =s2;
            s2=temp+s2;
            s2=c;

          */
            c+=1;

        }

    }
}
