package com.Assignment4;

import java.util.Scanner;

public class sumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        sum(n);
    }
    static void sum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Sum is "+sum);
    }
}
