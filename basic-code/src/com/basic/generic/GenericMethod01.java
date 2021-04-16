package com.basic.generic;

public class GenericMethod01 {
    public static void main(String[] args) {
        GenericMethod02 gm = new GenericMethod02();

        gm.test1(23);
        gm.test1("messi");
        gm.test1('c');
        gm.test1(true);

        GenericMethod02.test2(23);
        GenericMethod02.test2("messi");
        GenericMethod02.test2('c');
        GenericMethod02.test2(true);

    }


}
