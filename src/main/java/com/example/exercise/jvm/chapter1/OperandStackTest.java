package com.example.exercise.jvm.chapter1;

/**
 * @ClassName OperandStackTest
 * @Description
 * @Author 黄皓
 * @Date 2021/5/27 20:54
 **/
public class OperandStackTest {
    public void test(){
        byte i=10+20;
        int j=20;
        int k=i+j;
        int m=getSum();
    }
    final int getSum(){
        return 10+20;
    }
}
