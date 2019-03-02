package design_pattern;

import com.lujia.pattern.proxy.cglib.CglibProxy;
import com.lujia.pattern.proxy.jdk.JdkProxy;
import com.lujia.pattern.proxy.staticProxy.Father;
import com.lujia.pattern.proxy.staticProxy.Person;
import com.lujia.pattern.proxy.staticProxy.Son;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testStaticProxy(){

        Father father=new Father(new Son());

        father.findLover();
    }

    @Test
    public  void testJdkProxy(){
        JdkProxy jdkProxy=new JdkProxy();
        Person person =(Person) jdkProxy.getInstance(new Son());
        System.out.println(person.getClass());
        person.findLover();
    }

    @Test
    public void testCglibProxy(){
        CglibProxy cglibProxy=new CglibProxy();

        Son person = (Son) cglibProxy.getInstance(Son.class);
        person.findLover();

    }
}
