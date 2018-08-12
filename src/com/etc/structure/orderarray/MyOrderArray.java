package com.etc.structure.orderarray;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 15:46
 */
public class MyOrderArray {
    private long[] arry;
    //数组 元素的 长度
    private int elements;

    public MyOrderArray() {
        arry = new long[50];
    }

    public MyOrderArray(int maxSize) {
        arry = new long[maxSize];
    }

    //插入元素  要有 顺序  1 2  4 7 8 10  100 68 temp = 100 100 = 68 68 = tmp
    public void insert(long value){
        int i ;
        for( i =0;i < elements;i ++){
            if ( arry[i] > value){
                break;
            }
        }
        for (int j = elements; j > i; j--){
            arry[j] = arry[j-1];
        }
        arry[i] = value;
        elements++;
    }
    //显示数据
    public void display(){
        System.out.print("[");
        for (int i =0 ; i< elements;i++){
            System.out.print(arry[i]+" ");
        }
        System.out.println("]");
    }

    //查找数据 所在的索引位置 不在返回-1
    public int searchIndex(long value){
        int i ;
        for(i = 0 ; i< elements ; i++ ){
            if(arry[i] == value){
                break;
            }
        }
        if(i == elements) return -1;
        else return i ;
    }
    //查找数据根据索引来查

    public long searchDataByIndex(int index){
        if( index <0 || index >= elements){
            throw  new IndexOutOfBoundsException("数组下标越界"+index);
        }else{
            return arry[index];
        }
    }
    //         1 4 6 8  1 2 6 6 8  1 2 6 8 8
    //删除数据  1 2 4 6 8  1 4 6 8
    //         0 1 2 3 4
    public void delete(int index){
        if( index <0 || index >=elements){
            throw  new IndexOutOfBoundsException("数组下标越界"+index);
        }else{
            for( int i= index; i<elements;i++){
                arry[i] = arry[i+1];
            }
            elements--;
        }
    }

    //二分法查询数据
   //  1 2 6 8 9 10 11
    public int searchBinary(int value){
        int lowIndex =0 ;
        int powIndex = elements;
        int middleIndex = 0;
        while(true){
            middleIndex = (lowIndex+powIndex) /2 ;
           if(arry[middleIndex] == value){
               return middleIndex;
           }else if( lowIndex>powIndex){
               return -1;
           }else {
               if(arry[middleIndex] > value){ //需要从左边 查询数
                   powIndex = middleIndex-1 ;
               }else{ //需要从右边 查询数
                   lowIndex = middleIndex+1;
               }
           }
        }
    }

    //更新数据
    public void update(int index,long value){
        if ( index < 0 || index >=elements){
            throw  new IndexOutOfBoundsException("数组下标越界");
        }else{
            arry[index] = value ;
        }
    }

}
