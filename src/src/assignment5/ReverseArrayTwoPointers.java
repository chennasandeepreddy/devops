package assignment5;

import java.util.Arrays;

public class ReverseArrayTwoPointers {
    public static void main(String[] args) {
        int [] arr= {2,21,4,5};
        int start=0;
        int end=arr.length-1;
        for(start=0;start<end;start++){
            swap(arr,start,end);
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
