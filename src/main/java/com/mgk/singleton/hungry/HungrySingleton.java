package com.mgk.singleton.hungry;

/**
 * 饿汉式单例，再初始化类时就会加载出来。
 */
public class HungrySingleton {

    private HungrySingleton(){}

    private static final  HungrySingleton HUNGRY_SINGLETON =  new HungrySingleton();
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
