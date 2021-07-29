package com.example.exercise.jvm.chapter1;

/**
 * @ClassName StackErrorTest
 * @Description
 * @Author 黄皓
 * @Date 2021/5/17 21:51
 **/
public class StackErrorTest {
    private static int count=1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
    private void method1(){
        System.out.println("123");
    }
}
