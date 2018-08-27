package com.aman.designPatterns;

import java.util.Comparator;

public class Generics<T> {


    public T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

