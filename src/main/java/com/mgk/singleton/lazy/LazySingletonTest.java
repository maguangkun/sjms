package com.mgk.singleton.lazy;

import com.mgk.singleton.ThreadExe;

public class LazySingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadExe());
        Thread thread1 = new Thread(new ThreadExe());
        thread.start();
        thread1.start();
    }
}
