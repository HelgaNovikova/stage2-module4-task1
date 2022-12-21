package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!

    private volatile ThreadSafeSingleton helper;

    public ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton localRef = helper;
        if (localRef == null) {
            synchronized (this) {
                localRef = helper;
                if (localRef == null) {
                    helper = localRef = new ThreadSafeSingleton();
                }
            }
        }
        return localRef;
    }

}
