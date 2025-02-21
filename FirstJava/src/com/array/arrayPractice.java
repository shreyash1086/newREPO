//array list are slower that the standard array but helpful in program where lots of manipulation in array is required

// advantage of array list is that we do not need to mention the size of array list while creating array list

package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in a array ");
        int number = sc.nextInt();

        inputElemts(list,number,sc);
        System.out.println(list);
    }
    static void inputElemts(ArrayList<Integer> arr,int n,Scanner sc){
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+(i+1)+ "item : ");
            arr.add(sc.nextInt());
        }
    }
}
