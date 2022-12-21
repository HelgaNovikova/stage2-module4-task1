package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!

    private static volatile ThreadSafeSingleton helper;

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton localRef = helper;
        if (localRef == null) {
            synchronized (ThreadSafeSingleton.class) {
                // true
                localRef = helper;
                if (localRef == null) {
                    helper = localRef = new ThreadSafeSingleton();
                }
                //false
            }
        }
        return localRef;
    }

}
