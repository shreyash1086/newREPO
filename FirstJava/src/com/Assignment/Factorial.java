package com.Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        int result = factorial(number);
        System.out.println("The factorial is "+result);
    }

    static int factorial(int num){
        int i;
        int res = num;
        for(i = num;i>1;i--){
            res = res * (i-1);
        }
        return res;
    }
}
