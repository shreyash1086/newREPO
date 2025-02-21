package com.binarySearch;

public class findpeakelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = peakelement(arr);
        System.out.println(target);
    }
    static int peakelement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
//                we are in the left part of the array
                start = mid + 1;//we are searching possible answer in right side of the array
            }else{
//                we are in the right part of the array
                end = mid;//we are searching possible answer in left part of the array
                //here we are not doing mid - 1 because we are uncertain if there is any element greater than middle element in array so we say end = mid because middle element may be the possible answer
            }
//            the start and end pointer will point to the largest element in the array when the both will points to the same index the loop will break
        }
        return start;
    }

}
