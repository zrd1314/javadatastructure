package com.etc.structure.stack;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-19 17:19
 * 本质是数组  栈 特点是 先进后出
 */
public class MyStack {
    //底层是数组
    private long[] arry;
    //指向数组的指针
    private int top;
    Object[] elementData;

    public MyStack(){
        arry = new long[10];
        top = -1;
    }
    //带参数的构造方法
    public MyStack(int maxSize){
       arry = new long[maxSize];
        top = -1;
    }


    /**
     * 添加数据
     */
    public void push(long value){
        arry[++top] = value ;
    }

    //移除数据
    public long pop(){
        return arry[top--];
    }

    //查看栈顶的数据
    public long peek(){
        return arry[top];

    }
    //判断是否为空
    public boolean isEmpty(){
        return top == -1;
    }

    //判断栈是否满了
    public boolean isFull(){
        return top == arry.length-1;
    }

    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(2);
        m.push(98);
        m.push(24);
        m.push(66);
        m.push(11);
        m.push(52);
        m.push(58);
        m.push(13);
        m.push(165);
        m.push(189);
        m.pop();
        System.out.println("栈顶元素的值为"+m.peek());
        System.out.println("查看栈是否为空=="+m.isEmpty());
        System.out.println("查看栈是否满了=="+m.isFull());

    }
}
