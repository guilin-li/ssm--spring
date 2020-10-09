package com.lgl.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJdkProxy {
    public static void main(String[] args) {
        //Jdk代理
        //ILaoZong
        LaoZong laoZong = new LaoZong();
        MiShu miShu = new MiShu();
        //1 创建一个代理类，创建该类的对象
        ClassLoader classLoader = LaoZong.class.getClassLoader();
        Class[] interfaces= new Class[]{ILaoZong.class};
        //处理器
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //调 laibeijiu()
                miShu.laiBeiJiu();
                //调 eat()
                //laoZong.eat();
                //method 被增加的方法
                Object returnValue = method.invoke(laoZong,args);
                //调 laiGenYan()
                miShu.laiGenYan();
                return returnValue;
            }
        };
        ILaoZong iLaoZong = (ILaoZong) Proxy.newProxyInstance(classLoader,interfaces,handler);
        iLaoZong.eat();
    }

}
