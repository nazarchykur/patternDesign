package com.company.creational.abstract_method.factories;

import com.company.creational.abstract_method.buttons.Button;
import com.company.creational.abstract_method.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
