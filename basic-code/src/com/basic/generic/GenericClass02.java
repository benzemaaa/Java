package com.basic.generic;

import java.util.ArrayList;

public class GenericClass02<E> {
    private E name;
    ArrayList<E> list= new ArrayList<>();
    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public boolean add(E e){
        list.add(e);
        return true;
    }

}
