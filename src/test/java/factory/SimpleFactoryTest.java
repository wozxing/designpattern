package factory;


import factory.simplefactory.CalculatorFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CalculatorFactory factory = new CalculatorFactory();

        factory.creat1("IRS").calculate();
        factory.creat1("CRS").calculate();

        factory.creat2("factory.IRSCalculator4PV").calculate();
        factory.creat2("factory.CRSCalculator4PV").calculate();

        factory.creat3(IRSCalculator4PV.class).calculate();
        factory.creat3(CRSCalculator4PV.class).calculate();
    }
}
