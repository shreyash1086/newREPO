package com.shreyash;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check wheather it is armstrong or not : ");
        int number = sc.nextInt();

        int res = isArmstrong(number);

        if(res == number){
            System.out.println("The given number is armstrong number ");
        }
        else {
            System.out.println("Not a armstrong number ");
        }
    }
    static int isArmstrong(int n){
        String numStr = Integer.toString(n);
        int length = numStr.length();
        int newNum = 0;
        while (n > 0){
            int result = 1;
            int rem = n % 10;
            for(int i = 0;i<length;i++){
                result *= rem;
            }
            newNum = newNum + result;
            n /= 10;
        }
        return newNum;
    }
}
