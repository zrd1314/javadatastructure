package com.etc.structure.linkedlist;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-19 20:59
 * 相当于火车
 */
public class LinkList {
    //头节点
    private Node first;

    public LinkList(){}

    //插入一个节点，在头结点后插入节点
    public void insertFirst(long value){
        Node node = new Node(value) ;
        node.next = first ;
        first = node ;
    }

    //删除一个节点
    public Node deleteFirst(){
        Node temp = first ;
        first = temp.next;
        return temp;
    }

    //显示方法

    public void display(){
        Node cuurent = first;
        while(cuurent!=null){
            cuurent.display();
            cuurent = cuurent.next;
        }
    }

    /**
     * 查找方法
     */

    public Node find(long value){
       Node current  =first;
      while (current.data!= value){
          if(current.next == null){
              return null;
          }else{
              current = current.next;
          }
      }
      return current;
    }

    /**
     * 删除方法，根据数据域来进行删除
     */
    public Node delete(long value){
       Node current = first ;
       Node previous  =first;
       while(current.data!= value){
           if(current.next == null ){
               return null;
           }else{
               previous = current;
               current = current.next ;
           }
       }
       if(current == first){
           first = first.next ;
       }else{
           previous.next = current.next;
       }
       return current;

    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22);
        linkList.insertFirst(88);
        linkList.insertFirst(66);
        linkList.insertFirst(33);
        linkList.insertFirst(44);
       // linkList.deleteFirst();
        linkList.delete(44);
        linkList.display();
    }
}
