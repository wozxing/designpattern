package prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrototypeTest {

    public static void main(String[] args) throws Exception {


        Trade t1 = new Trade();
        t1.setTradeNo("trade1");
        CashFlow cf1 = new CashFlow();
        cf1.setPaymentDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-05-08"));
        cf1.setPaymentAmount(1000d);
        t1.setCf(cf1);

        Trade t2 = (Trade) t1.clone();

        System.out.println(t1 + "," + t1.getCf());
        System.out.println(t2 + "," + t2.getCf());



        DeepTrade dt1 = new DeepTrade();
        dt1.setTradeNo("deepTrade1");
        CashFlow cf4Dt = new CashFlow();
        cf4Dt.setPaymentDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-05-08"));
        cf4Dt.setPaymentAmount(1000d);
        dt1.setCf(cf4Dt);

        DeepTrade dt2 = (DeepTrade) dt1.deepClone();

        System.out.println(dt1 + "," + dt1.getCf());
        System.out.println(dt2 + "," + dt2.getCf());


    }
}
