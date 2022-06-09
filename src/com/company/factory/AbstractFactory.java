package com.company.factory;

public interface AbstractFactory<T> {
   T create(String entityType);
}
