package com.lujia.pattern.proxy.jdk;

import com.lujia.pattern.proxy.staticProxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author :lujia
 * @date :2018/10/8  11:09
 */
public class JdkProxy implements InvocationHandler {



    private Person person;


    public Object getInstance(Person person){
        this.person=person;
        Class<? extends Person> aClass = person.getClass();

        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("jdk动态代理开始");
        method.invoke(person,args);
        System.out.println("jdk动态代理结束");
        return null;
    }
}
