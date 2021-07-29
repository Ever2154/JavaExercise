package com.example.exercise.jvm.chapter1;

import java.util.function.Supplier;

/**
 * @ClassName InvokeDynamicTest
 * @Description
 * @Author 黄皓
 * @Date 2021/5/31 21:49
 **/
public class InvokeDynamicTest {
    private int a;
    //实例构造方法和初始化块的顺序不影响 init字节码的顺序 初始化块在前
    public InvokeDynamicTest(int a) {
        this.a = a;
    }
    {
        a=10;
    }


    static void testLambda(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {

        testLambda(()-> "123");
    }
}
