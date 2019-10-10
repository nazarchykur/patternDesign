package com.company.creational.abstract_method;

import com.company.creational.abstract_method.app.Application;
import com.company.creational.abstract_method.factories.GUIFactory;
import com.company.creational.abstract_method.factories.MacOSFactory;
import com.company.creational.abstract_method.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(){

        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
