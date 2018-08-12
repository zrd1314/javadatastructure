package com.etc.structure.simplesort;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 17:14
 */
public class 选择排序 {
    //选择排序  34 23 2  -4 1
    public static void selectSort(long[] arr){
        int k =0 ;
        long temp = 0;
        for(int i=0;i<arr.length-1;i++){
            k = i ;
            for(int j =i ;j< arr.length;j++){
                if(arr[j] <arr[k]){
                    k = j;
                }
            }
            temp =arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }

    }
    public static void printArray(long[] arr){
        System.out.print("[");
        for (long num :arr){
            System.out.print(num+" ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        long arr[]= {34,23,2,-4 ,1};
        selectSort(arr);
    }
}
