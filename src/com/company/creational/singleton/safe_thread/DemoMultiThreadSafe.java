package com.company.creational.singleton.safe_thread;

public class DemoMultiThreadSafe {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadFoo = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("foo");
            System.out.println("singleton.value = " + singleton.value);
        });

        Thread threadBar = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("bar");
            System.out.println("singleton.value = " + singleton.value);
        });

        threadFoo.start();
        threadBar.start();

        //RESULT:
        //
        //singleton.value = foo
        //singleton.value = foo
    }
}
