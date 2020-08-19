package com.mgk.singleton.lazy;

/**
 * 懒加载
 */
public class LazySingleton {
    private static LazySingleton LAZY_SINGLETON = null;
    private LazySingleton(){}
    //public  static LazySingleton getInstance(){//存在线程安全问题
    //public synchronized static LazySingleton getInstance(){//效率低
    public static LazySingleton getInstance(){//双重检查锁
        if (LAZY_SINGLETON == null){
            synchronized (LazySingleton.class){
                if(LAZY_SINGLETON==null){
                    LAZY_SINGLETON = new LazySingleton();
                }
            }
        }
        return LAZY_SINGLETON;
    }
}
