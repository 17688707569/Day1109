package com.itheima.Demo;

public class Demo5 {
    //方法一: 递归
    public static void main(String[] args) {
        int n = 5;
        System.out.println("第" + n + "个月，兔子的总数为" + fun(n));
    }

    private static int fun(int n) {
        if ((1 == n) || (2 == n))
            return 1;
        else
            return (fun(n - 1) + fun(n - 2));

    }
}
