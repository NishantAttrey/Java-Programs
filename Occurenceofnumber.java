package com.nishant;

import java.util.Scanner;

public class Occurenceofnumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please,Write the number you want to check");
        char check=input.next().trim().charAt(0);
        //System.out.println(check);
        System.out.println("Give the series of number you want to check");
        String numbers=input.next();
        //System.out.println(numbers.length());
        int l=numbers.length();
        //System.out.println("value of l"+l);
        int i=0;
        int counter=0;
        //System.out.println("value of i"+i);
        while (i<l){
            char cc=(numbers.charAt(i));
            if(cc==check){
                counter++;
            }


            i++;


        }
        System.out.println("this is counter  "+counter);
    }}
       /* while(i<l){
            if(check==numbers.charAt(i)){
                counter++;
                i++;
            }

        }
        System.out.println(counter);
    }
}
*/