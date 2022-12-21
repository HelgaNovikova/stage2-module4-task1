package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private ThreadSafeSingleton() {
    }

    private static volatile ThreadSafeSingleton instance;

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
