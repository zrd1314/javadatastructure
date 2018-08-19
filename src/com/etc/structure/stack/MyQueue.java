package com.etc.structure.stack;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-19 17:44
 * 队列 底层也是 数组   特点是 先进先出  ， 跟在火车站买票情景相似
 */
public class MyQueue {
    private  long[] arry;
    //有效数据大小
    private  int elements;
    //对头
    private int front;
    //对尾
    private int end ;

    public MyQueue(){
        arry = new long[10];
        elements = 0 ;
        front = 0;
        end = -1 ;
    }
    //带参数的构造方法
    public MyQueue(int maxSize){
        arry = new long[maxSize];
        elements = 0 ;
        front = 0;
        end = -1 ;
    }

    //添加数据 ，从队尾添加数据
    public void insert(long value){
        arry[++end] = value ;
        elements++;
    }
    //删除数据 从对头删除数据
    public long remove(){
        elements--;
       return  arry[front++];
    }

    //查看数据 ，从对头查看
    public long peek(){
        return arry[front];
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return elements == arry.length;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.insert(2);
        myQueue.insert(8);
        myQueue.insert(1);
        myQueue.insert(200);
        System.out.println("查看队列的头数据"+ myQueue.peek());
        System.out.println("查看队列的头数据"+ myQueue.peek());
        System.out.println("查看队列的数据是否为空"+ myQueue.isEmpty());
        while(!myQueue.isEmpty()){
            System.out.print(myQueue.remove()+" ");
        }
        myQueue.insert(62); //这一行就会报错 由于没有 重置对头和队尾导致的问题
    }
}
