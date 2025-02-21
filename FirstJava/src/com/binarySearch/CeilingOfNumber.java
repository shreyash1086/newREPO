package com.binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 12;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
