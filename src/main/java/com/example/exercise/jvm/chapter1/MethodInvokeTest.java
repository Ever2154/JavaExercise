package com.example.exercise.jvm.chapter1;

/**
 * @ClassName MethodInvokeTest
 * @Description
 * @Author 黄皓
 * @Date 2021/5/27 22:28
 **/
public class MethodInvokeTest {


    public static void main(String[] args) {
        Father father=new Father();
        father.method1();
    }
}

class Father{
     final void method1(){
        System.out.println("father method1");
    }
}
class Son extends Father{
}
