package com.lujia.pattern.singleton;

/**
 * 单例模式之懒汉
 * @author :lujia
 * @date :2018/9/9  19:11
 */
public class LazySingleton {

    private LazySingleton(){

    }

    private static LazySingleton lazySingleton=null;

    /**
     * 实现懒加载，
     * 但是在线程并发的情况下可能有问题，同时有两个线程来访问getInstance方法，就会创建两个不同的实例
     * @return
     */
    public static LazySingleton getInstance(){
        if (null==lazySingleton){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }


    /**
     * 加锁
     * @return
     */
    public static synchronized LazySingleton getInstanceSync(){
        if (null==lazySingleton){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }



}
