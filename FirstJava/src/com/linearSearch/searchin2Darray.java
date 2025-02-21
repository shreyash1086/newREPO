package com.linearSearch;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,1,4},
                {56,2,78},
                {45,89,54},
                {2,24,53,32,12},
                {78,51}
        };
        int target =  89;
        int[] ans = array2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] array2d(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
