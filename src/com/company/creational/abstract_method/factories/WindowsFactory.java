package com.company.creational.abstract_method.factories;

import com.company.creational.abstract_method.buttons.Button;
import com.company.creational.abstract_method.buttons.WindowsButton;
import com.company.creational.abstract_method.checkboxes.Checkbox;
import com.company.creational.abstract_method.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
