package com.nishant;



public class LargestNumber {
    public static void main(String[] args) {

           /* Scanner option = new Scanner(System.in);
            System.out.println("enter y/n");
            String opt=option.toString();
            if (opt.equals("y")){
            */
        int[] numbers = new int[]{1,2,3,4,5};
        int i=0;
        int maxnum=0;
        while(i<5){
            int check= numbers[i];

            if(check>maxnum){
                maxnum=check;

            }
            i+=1;
                   }
        System.out.println("Largest Number is "+maxnum);
        }




}


