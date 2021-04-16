package com.thread.lambda;

public class Lambda01 {
//    静态内部类
    public static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("lambda2");
        }
    }

    public static void main(String[] args) {
//        实现类
        ILike like = new Like();
        like.lambda();

//        静态内部类
        like = new Like2();
        like.lambda();

//        局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("lambda3");
            }
        }
        like = new Like3();
        like.lambda();

//        匿名内部类, 没有类的名称, 必须借助接口或者父类 (new 接口名)
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("lambda4");
            }
        };
        like.lambda();


//        lambda表达式
        like = () -> {
            System.out.println("lambda5");
        };
        like.lambda();

    }
}

//1.定义一个函数式接口
interface ILike{
    void lambda();
}

//2.实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("lambda1");
    }
}