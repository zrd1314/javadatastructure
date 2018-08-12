package com.etc.structure.simplesort;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 20:00
 */
public class 插入排序 {
    public static <T extends Comparable<? super T>> void insertSort(T[] a){
     // 8 34 64 51 32 21  // 8 34 51 64 32 21  // 8 34 51 64 64 21
        for(int p = 1; p < a.length; p++){
            T tmp = a[p];//保存当前位置p的元素，其中[0,p-1]已经有序
            int j;
            for(j = p; j > 0 && tmp.compareTo(a[j-1]) < 0; j--){
                a[j] = a[j-1];//后移一位
            }
            a[j] = tmp;//插入到合适的位置
        }
    }
//34,8,64,51,32,21
    public static void main(String[] args) {
        Integer[] arr = {34,8,64,51,32,21};
        insertSort(arr);
        for (Integer i : arr) {
            System.out.print(i+" ");
        }
    }
}
