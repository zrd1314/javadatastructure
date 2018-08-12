package com.etc.structure.simplesort;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 16:38
 */
public class 冒泡排序 {
    // 30 35 4 63 20  30 35 4 20 63    30 4 35 20 63   4 30 35 20 63
    //第一趟 排序    4 30 35 20 63
    //第二趟  4 30 20 35 63    4  20 30 35 63
    //第三
    public static void bubbleSort(long[] arr){
        long temp ;
        for (int i =0;i<arr.length-1;i++ ){ // 表示要走的趟数
            for (int j = arr.length-1 ; j>i ; j--){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp ;
                }
            }
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
}
