package com.example.exercise.jvm.chapter1;

/**
 * @ClassName IncrementTest
 * @Description
 * @Author 黄皓
 * @Date 2021/5/27 20:54
 **/
public class IncrementTest {
    public static void main(String[] args) {
        //第一类问题
        int i1=10;
        i1++;

        int i2=10;
        ++i2;

        //第二类问题
        int i3=10;
        int i4=i3++;

        int i5=10;
        int i6=++i5;

        //第三类问题
        int i7=10;
        i7=i7++;

        int i8=10;
        i8=++i8;

        //第四类问题
        int i9=10;
        int i10=i9++ + ++i9;
        System.out.println(i10);

    }
}
