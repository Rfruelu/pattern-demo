package com.lujia.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册中心实现单列
 *
 * @author :lujia
 * @date :2018/9/27  15:25
 */
public class RegisterSingleton {


    private static Map<String, Object> registerMap = new ConcurrentHashMap<>();


    public static RegisterSingleton getInstance() {
        String name = RegisterSingleton.class.getName();
        /*RegisterSingleton singleton = (RegisterSingleton)registerMap.get(name);

        if (singleton==null){
            try {
                registerMap.put(name,Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return singleton;*/


        if(registerMap.get(name) == null){
            try {
                registerMap.put(name, new RegisterSingleton());
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return (RegisterSingleton)registerMap.get(name);
    }
}
