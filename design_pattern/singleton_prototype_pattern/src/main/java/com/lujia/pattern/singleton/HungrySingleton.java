package com.lujia.pattern.singleton;

/**
 * 单例模式之饿汉
 * @author :lujia
 * @date :2018/9/9  19:03
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRYSINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 不会有线程安全问题，性能也很好，
     * 因为在类初始化的时候就要创建对象，所以存在资源浪费的问题(可能没用到，就new了)，
     * @return
     */
    public static HungrySingleton getInstance() {
        return HUNGRYSINGLETON;
    }
}
