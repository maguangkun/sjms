package com.mgk.singleton.statics;

public class StaticSingletonTest {
    public static void main(String[] args) {
        StaticSingleton instance1=  StaticSingleton.getInstance();
        StaticSingleton instance = StaticSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance);
    }
}
