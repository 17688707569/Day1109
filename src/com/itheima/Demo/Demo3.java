package com.itheima.Demo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        long a,b = 0,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("输入数字a的值:");
        a= s.nextInt();
        System.out.println("输入相加的项数:");
        int n = s.nextInt();
        int i = 0;

        while (i<n){
            b=b+a;
            sum=sum+b;
            a=a*10;
            ++i;
        }
        System.out.println(sum);
    }
}
