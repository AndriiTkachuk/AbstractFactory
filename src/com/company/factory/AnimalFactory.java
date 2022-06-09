package com.company.factory;

import com.company.animal.Animal;
import com.company.animal.Dog;
import com.company.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal>{

    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }
}
