package com.lujia.pattern.singleton;

/**
 * 静态内部类实现单列
 * @author :lujia
 * @date :2018/9/25  9:06
 */
public class StaticInternalSingleton {

    private boolean initialized=false;
    private StaticInternalSingleton(){

        synchronized (StaticInternalSingleton.class){
            if (initialized){
                throw  new RuntimeException("单列被侵犯");
            }else {
                initialized=!initialized;
            }
        }
    }

    public static final StaticInternalSingleton getInstance(){
        return InternalClass.internalSingleton;
    }

    private static class InternalClass{

        private static final StaticInternalSingleton internalSingleton=new StaticInternalSingleton();
    }
}
