package com.mgk.singleton.statics;

public class StaticSingleton {
    private StaticSingleton(){}
    public static  StaticSingleton getInstance(){
        return InnerStaticClassSingleton.STATIC_SINGLETON;
    }
    private static class InnerStaticClassSingleton{
        public InnerStaticClassSingleton(){
            System.out.println("我是静态内部类");
        }
        private static final StaticSingleton STATIC_SINGLETON =new StaticSingleton();
    }
}
