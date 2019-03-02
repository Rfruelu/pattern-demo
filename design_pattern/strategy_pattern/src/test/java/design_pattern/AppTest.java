package design_pattern;

import com.lujia.pattern.strategy.Order;
import com.lujia.pattern.strategy.PayStatus;
import com.lujia.pattern.strategy.PayType;
import com.lujia.pattern.strategy.Payment;
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
    public void testPay(){
        Order order=new Order();

        PayStatus pay = order.pay(PayType.ALI);

        Payment payment = PayType.ALI.getPayment();

        System.out.println("payment1:"+payment);
        System.out.println("payment2:"+PayType.ALI.getPayment());
        System.out.println("payment3:"+PayType.ALI.getPayment());
        System.out.println("payment4:"+PayType.ALI.getPayment());
        System.out.println("payment5:"+PayType.ALI.getPayment());
        //System.out.println(pay);


        //System.out.println(order.pay(PayType.WEIXIN));
    }
}
