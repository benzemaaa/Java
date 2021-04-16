package com.basic.generic;

public class GenericInterfaceImpl01<E> implements GenericInterface<E>{
    public void method(E e){
        System.out.println(e);
    }

}
