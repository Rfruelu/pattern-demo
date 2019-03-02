package com.lujia.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author :lujia
 * @date :2018/10/8  15:13
 */
public class CglibProxy  implements MethodInterceptor{

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer=new Enhancer();

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理开始----");

        System.out.println(o.getClass());
        //执行被代理的方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("cglib代理结束----");

        return null;
    }
}
