package com.etc.structure.lineararray;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-8 23:28
 * 封装对 数组操作的类
 */
public class MyArray {
    private long[] arry;
    //数组 元素的 长度
    private int elements;

    public MyArray() {
        arry = new long[50];
    }

    public MyArray(int maxSize) {
        arry = new long[maxSize];
    }

     //插入元素
    public void insert(long value){
        arry[elements] = value;
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

    //更新数据
    public void update(int index,long value){
        if ( index < 0 || index >=elements){
            throw  new IndexOutOfBoundsException("数组下标越界");
        }else{
            arry[index] = value ;
        }
    }


}

