package com.company.creational.singleton.safe_thread;

public final class Singleton {
    // The field must be declared volatile so that double check lock would work.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
       this.value = value;
    }

    public static Singleton getInstance(String value) {
        // This code may appear a bit convoluted. In particular, the need for
        // the local variable result may be unclear. This is a micro-
        // optimization.
        //
        // The field would be read first time in the first if statement and
        // second time in the return statement. The field is declared volatile,
        // which means it has to be refetched from memory every time it is
        // accessed (more processing is required to access volatile variables)
        // and can not be stored into a register by the compiler. When copied to
        // the local variable and then used in both statements (if and return),
        // the register optimization can be done by the JVM.
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(value);
                }
            }
        }
        return result;
    }
}
