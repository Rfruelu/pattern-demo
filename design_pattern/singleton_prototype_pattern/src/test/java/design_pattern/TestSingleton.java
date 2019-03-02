package design_pattern;

import com.lujia.pattern.singleton.HungrySingleton;
import com.lujia.pattern.singleton.LazySingleton;
import com.lujia.pattern.singleton.RegisterMap;
import com.lujia.pattern.singleton.SingletonEnum;
import com.lujia.pattern.singleton.StaticInternalSingleton;
import org.junit.Test;

/**
 * @author :lujia
 * @date :2018/9/9  19:06
 */
public class TestSingleton {

    @Test
    public void testHungry(){
        HungrySingleton hungrySingleton=HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1=HungrySingleton.getInstance();

        //两个对象的地址是相同的，
        System.out.println(hungrySingleton==hungrySingleton1);
    }

    @Test
    public void testLazy(){
     /*   int count=2000000000;
        for (int i=0;i<count;i++){

            LazySingleton lazySingleton=LazySingleton.getInstance();

        }*/

        LazySingleton lazySingleton=LazySingleton.getInstance();
        LazySingleton lazySingleton1=LazySingleton.getInstance();

        System.out.println(lazySingleton==lazySingleton1);

    }


    @Test
    public void testInternalClass(){

        StaticInternalSingleton instance = StaticInternalSingleton.getInstance();
        StaticInternalSingleton instance1 = StaticInternalSingleton.getInstance();

        System.out.println(instance==instance1);


    }


    @Test
    public void testEnum(){
        System.out.println(SingletonEnum.RED==SingletonEnum.RED);

    }


    @Test
    public void testRegisterMap(){
        for (int i=0;i<10;i++){
            new Thread(()->{

                RegisterMap instance = RegisterMap.getInstance(null);
                System.out.println(instance);
            }).start();
        }
       /* int count = 200;

        //发令枪，我就能想到运动员
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count;i ++) {
            new Thread(){
                @Override
                public void run() {
                    try{

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        //必然会调用，可能会有很多线程同时去访问getInstance()
                        Object obj = RegisterSingleton.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj);

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性

            //每次启动一个线程，count --
            latch.countDown();

        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));*/
    }


}
