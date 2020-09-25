package com.example.demo;

/**
 * 测试类加载机制
 */
public class ClassLoadTest{

    public static void main(String[] args) {
        //构造该类的实例、调用该类的静态属性或方法、使用子类时会触发父类的加载
        System.out.println("----------------start----------------");
        new Son();
        new Son();
        System.out.println("-----------------end-----------------");
    }

}

class Parent{

    static int i = p();

    static {
        System.out.println("Parent静态代码块");
    }

    public Parent(){
        System.out.println("Parent构造方法");
    }

    {
        System.out.println("Parent普通代码块");
    }

    static int p(){
        System.out.println("Parent静态变量");
        return 0;
    }
}

class Son extends Parent{
    static int s = s();

    static {
        System.out.println("Son静态代码块");
    }

    public Son() {
        System.out.println("Son构造方法");
    }

    {
        System.out.println("Son代码块");
    }

    static int s(){
        System.out.println("Son静态变量");
        return 0;
    }
}
