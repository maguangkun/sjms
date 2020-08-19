package com.mgk.singleton;

import com.mgk.singleton.lazy.LazySingleton;

public class ThreadExe implements  Runnable{
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
    }
}
