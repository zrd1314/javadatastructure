package com.etc.structure.stack;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-19 18:06
 */
public class MyCycleQueue {
    private  long[] arry;
    //有效数据大小
    private  int elements;
    //对头
    private int front;
    //对尾
    private int end ;

    public MyCycleQueue(){
        arry = new long[10];
        elements = 0 ;
        front = 0;
        end = -1 ;
    }
    //带参数的构造方法
    public MyCycleQueue(int maxSize){
        arry = new long[maxSize];
        elements = 0 ;
        front = 0;
        end = -1 ;
    }

    //添加数据 ，从队尾添加数据
    public void insert(long value){
        if(end == arry.length -1){
            end = -1;
        }
        arry[++end] = value ;
        elements++;
    }
    //删除数据 从对头删除数据
    public long remove() {
        long value = arry[front++];
        if(front == arry.length) {
            front = 0;
        }
        elements--;
        return value;
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
        MyCycleQueue myQueue = new MyCycleQueue(4);
        myQueue.insert(88);
        myQueue.insert(8);
        myQueue.insert(1);
        myQueue.insert(200);
        System.out.println("查看队列的头数据"+ myQueue.peek());
        System.out.println("查看队列的头数据"+ myQueue.peek());
        System.out.println("查看队列的数据是否为空"+ myQueue.isEmpty());
        while(!myQueue.isEmpty()){
            System.out.print(myQueue.remove()+" ");
        }
        myQueue.insert(62);
        myQueue.insert(56);
        System.out.println("查看队列的头数据"+ myQueue.peek());
    }
}
