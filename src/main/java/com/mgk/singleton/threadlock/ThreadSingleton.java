package com.mgk.singleton.threadlock;

public class ThreadSingleton {
    private static final  ThreadLocal<Object> thread = new ThreadLocal<Object>(){
        @Override
        protected Object initialValue() {
            return new Object();
        }

    };
    public static Object get(){
        return  thread.get();
    }
}
