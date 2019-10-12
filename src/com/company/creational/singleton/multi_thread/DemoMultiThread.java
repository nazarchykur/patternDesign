package com.company.creational.singleton.multi_thread;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // we can use class which impl Runnable interface
//        Thread threadFoo = new Thread(new ThreadFoo());
//        Thread threadBar = new Thread(new ThreadBar());

        // or
        // we can use lambda instead
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

        // RESULT:
        //
        //singleton.value = foo
        //singleton.value = bar
    }

//    static class TreadFoo implements Runnable{
//        @Override
//        public void run() {
//            Singleton singleton = Singleton.getInstance("foo");
//            System.out.println("singleton.value = " + singleton.value);
//        }
//    }
//
//    static class TreadBar implements Runnable{
//        @Override
//        public void run() {
//            Singleton singleton = Singleton.getInstance("bar");
//            System.out.println("singleton.value = " + singleton.value);
//        }
//    }
}
