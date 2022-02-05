package com.nishant;

import java.util.Scanner;
/*
Fibonacci  series is a series "0,1,1,2,3,5,....,n" in this series the number is the sum of two previous numbers.
Here first two numbers are default which will be given by the programmer
more upgrades are coming soon.

 */
public class FibonacciSeries {
    public static void main(String[] args) {
        //This program tells the fibonacci number at the particular index
        Scanner i = new Scanner(System.in);
        int index=i.nextInt();//accepts the index number from the user
        int a = 0, b= 1, c=2;
/*
'a' and 'b' are the first two numbers of the fibonacci series as stated above.
'c' is  the index counter used in loop which will be starting from index number 2 as index 0 and 1 are already defined.
 */
        while(c<=index){
            int temp= b;//here the value of b is stored in temp
            b=temp+a;//value of b is updated according to logic
            a=temp;//value of a is updated to temp
            c++;//value of c is updated


        }
        System.out.println(b);

        }

    }

