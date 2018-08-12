package com.etc.structure.orderarray;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 15:59
 */
public class TestOrderArray {
    public static void main(String[] args) {
        MyOrderArray myOrderArray = new MyOrderArray();
        myOrderArray.insert(8);
        myOrderArray.insert(4);
        myOrderArray.insert(6);
        myOrderArray.insert(7);
        myOrderArray.insert(1);
        myOrderArray.display();
        //1 4 6 7 8
        System.out.println(myOrderArray.searchBinary(7));
    }
}
