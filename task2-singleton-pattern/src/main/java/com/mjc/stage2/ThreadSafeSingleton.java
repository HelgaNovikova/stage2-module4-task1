package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private ThreadSafeSingleton() {
        throw new UnsupportedOperationException();
    }

    private static volatile ThreadSafeSingleton instance;

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton localRef = instance;
        if (localRef == null) {
            synchronized (ThreadSafeSingleton.class) {
                // true
                localRef = instance;
                if (localRef == null) {
                    instance = localRef = new ThreadSafeSingleton();
                }
                //false
            }
        }
        return localRef;
    }

}
