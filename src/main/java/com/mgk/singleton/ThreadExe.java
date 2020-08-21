package com.mgk.singleton;

import com.mgk.singleton.lazy.LazySingleton;
import com.mgk.singleton.threadlock.ThreadSingleton;

public class ThreadExe implements  Runnable{
    public void run() {
        //LazySingleton instance = LazySingleton.getInstance();
        //System.out.println(instance);
        Object o = ThreadSingleton.get();
        System.out.println(o);

    }
}
