package com.itheima.Demo;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;

import javax.jnlp.SingleInstanceService;

public class Singleton {
private Singleton(){};
public static Singleton getInstance(){
    return SingletonInstance.instance;
}
private static class SingletonInstance{
    static  Singleton instance= new Singleton();
}
}
