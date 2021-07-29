package com.example.exercise.jvm.chapter1;

import java.io.File;

public class StackStructure {
    public static void main(String[] args) {
        int i=2;
        int j=3;
        int k=i+j;
        File file=new File("12312");
        System.out.println("123");
        System.out.println(System.getProperty("java.ext.dirs"));
        StackStructure stackStructure=null;
        stackStructure.show();
    }
    private static void show(){
        System.out.println("123");
    }
}
