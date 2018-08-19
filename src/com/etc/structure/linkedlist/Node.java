package com.etc.structure.linkedlist;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-19 20:55
 * 链节点 相当于车厢
 */
public class Node {
    //数据域
    public   long data;
    //指针域(下一个节点的引用)
    public  Node next;

    public Node(long value){
        this.data = value ;
    }
    //显示方法
    public void display(){
        System.out.print(data+" ");
    }
}
