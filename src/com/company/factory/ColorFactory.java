package com.company.factory;

import com.company.color.Black;
import com.company.color.Color;
import com.company.color.White;

public class ColorFactory implements AbstractFactory<Color> {

    public Color create(String colorType) {

        if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(colorType)) {
            return new Black();
        }
        return null;
    }
}
