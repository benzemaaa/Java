package com.basic.generic;

public class GenericInterface01 {
    public static void main(String[] args) {
        GenericInterfaceImpl01 gii01 = new GenericInterfaceImpl01();
        gii01.method(1);
        gii01.method("messi");
        gii01.method('q');
        gii01.method(false);

        GenericInterfaceImpl02 gii02 = new GenericInterfaceImpl02();
        gii02.method("highbury");
    }
}
