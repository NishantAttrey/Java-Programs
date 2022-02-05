package com.nishant;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2, ans = 0;
        System.out.println("enter the value of 1st number");
        num1=input.nextDouble();
        System.out.println("enter the value of 2nd number");
        num2=input.nextDouble();
        System.out.println("enter the operator");
        char operator1=input.next().trim().charAt(0);
        //starting calculation of first two numbers

        if(operator1=='%'){
            ans=num1%num2;
        }
        else if (operator1=='-'){
            ans=num1-num2;
        }
        else if (operator1=='/'){
            if(num1!=0&&num2!=0){
            ans=num1/num2;}
            else{
                System.out.println("This calculation cannot pe processed");

            }
        }
        else if (operator1=='*'){
            ans=num1*num2;
        }
        else if (operator1=='+'){
            ans=num1+num2;
        }

            while(true){
                //it is an infinite loop until the operator is 'x' or 'X'
                System.out.println("enter the next operator");
                char operator2=input.next().trim().charAt(0);
                if(operator2=='x'||operator2=='X')
                    break;
                else {
                    System.out.println("enter the next number");
                    double num3=input.nextDouble();
                    if(operator2=='%'){
                        double temp=ans;
                        ans=temp%num3;
                    }
                    else if(operator2=='-'){
                        double temp=ans;
                        ans=temp-num3;
                    }
                    else if(operator2=='/'){
                        double temp=ans;
                        if (num3!=0&&temp!=0){
                        ans=temp/num3;}
                        else {
                            System.out.println("The answer is "+temp);
                        }
                    }
                    else  if(operator2=='*'){
                        double temp=ans;
                        ans=temp*num3;
                    }
                    else if(operator2=='+'){
                        double temp=ans;
                        ans=temp+num3;
                    }


                }
            }
        System.out.println("The answer is  "+ans);
        }


    }

