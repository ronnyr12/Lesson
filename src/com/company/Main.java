package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sayMyAge();
        sayMyAge();
        /*Scanner s = new Scanner(System.in);
        System.out.println("enter 1st value: ");

        int val1 = s.nextInt();
        System.out.println("enter 2nd value: ");
        int val2 = s.nextInt();

        int small = smallest(val1, val2);

        System.out.println("the smallest number is "+small);*/
    }


    public static void sayMyAge(){
        Scanner s = new Scanner(System.in);
        System.out.println("how old are you?");
        int age = s.nextInt();
        if(age> 40)
            System.out.println("u are a boomer!!!");
        else
            System.out.println("i have a tik tok");

    }
    //-----------------practice worksheet -chapter 7--------------

    /**
     * q1 - solution
     * the method return a number add one to every digit
     * @param n
     * @return
     */
    public static int plusOne(int n){
        int new_num = 0;



        
        return new_num;
    }

    /**
     * the method returns the smallest number
     * @param val1
     * @param val2
     * @return - int that is the smallest
     */
    public static int smallest(int val1, int val2){
        //the implementation of the method
        //how the method works

        if(val1 < val2) {
            return val1;
        }
        else if(val2 < val1)
            return val2;
        else    //both are equals so returns val1
            return val1;
    }
}
