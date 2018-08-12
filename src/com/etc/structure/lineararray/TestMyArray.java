package com.etc.structure.lineararray;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-8-12 15:02
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.insert(30);
        myArray.insert(50);
        myArray.insert(36);
        myArray.insert(80);
        myArray.insert(90);
        myArray.display();
        //查询数据所在的索引位置
  //      System.out.println(myArray.searchIndex(90));
    //    System.out.println(myArray.searchDataByIndex(5));
//        myArray.delete(2);
//        myArray.display();
        myArray.update(4,100);
        myArray.display();
    }
}
