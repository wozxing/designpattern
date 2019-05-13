package factory.simplefactory;


import factory.CRSCalculator4PV;
import factory.ICalculator4PV;
import factory.IRSCalculator4PV;

public class CalculatorFactory {

    public ICalculator4PV creat1(String productName) {
        if ("IRS".equals(productName)) {
            return new IRSCalculator4PV();
        } else if ("CRS".equals(productName)) {
            return new CRSCalculator4PV();
        }
        throw new IllegalArgumentException("illegal product");
    }

    public ICalculator4PV creat2(String clazzName) {
        try {
            if (null != clazzName && !"".equals(clazzName)) {
                return (ICalculator4PV) Class.forName(clazzName).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }

    public ICalculator4PV creat3(Class clazz) {
        try {
            if (null != clazz) {
                return (ICalculator4PV)clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
