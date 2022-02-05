package com.nishant;

import java.util.Scanner;

public class ErrorSolve {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2, ans = 0;
       // System.out.println("is it going to be series you want to  calculate");
        //char choice =input.next().trim().charAt(0);
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
            ans=num1/num2;
        }
        else if (operator1=='*'){
            ans=num1*num2;
        }
        else if (operator1=='+'){
            ans=num1+num2;
        }
        /*switch (operator1){

        case'+':{
            ans=num1+num2;
        }
        case'*':{
                ans=num1*num2;
            }
        break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator1);
        }//end of switch statement*/
        //to choose whether it is a series calculation or just two numbers
            while(true){
                //it is a infinite loop until the operator is 'x' or 'X'
                System.out.println("enter the next operator");
                char operator2=input.next().trim().charAt(0);
                if(operator2=='x'||operator2=='X')
                    break;
                else {
                  System.out.println("enter the next number");
                 double num3=input.nextDouble();
                 if(operator2=='+'){
                    double temp=ans;
                    ans=temp+num3;
                }

            }
        }

        System.out.println("the answer is  "+ans);
 }

    }
