package com.company.creational.abstract_method.factories;

import com.company.creational.abstract_method.buttons.Button;
import com.company.creational.abstract_method.buttons.MacOSButton;
import com.company.creational.abstract_method.checkboxes.Checkbox;
import com.company.creational.abstract_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
