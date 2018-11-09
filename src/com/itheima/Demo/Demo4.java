package com.itheima.Demo;

public class Demo4 {
    public static void main(String[] args) {
        double h=100;
        double s=100;
        for (int i = 0; i < 10; i++) {
            s = s +h;
            h =h/2;
        }
        System.out.println("总共经过的历程是:" + s);
        System.out.println("反弹高度是:" + h / 2);
    }
}
