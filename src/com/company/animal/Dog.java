package com.company.animal;

public class Dog implements Animal{

    public String getAnimal() {
        return "Dog";
    }

    public String makeSound() {
        return "Gav-gav";
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
