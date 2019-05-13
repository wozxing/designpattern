package factory;


import factory.abstractfactory.CRSCalculatorFactory;
import factory.abstractfactory.ICalculatorFactory;
import factory.abstractfactory.IRSCalculatorFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        ICalculatorFactory factory1 = new IRSCalculatorFactory();
        ICalculatorFactory factory2 = new CRSCalculatorFactory();

        factory1.createPvCalculator().calculate();
        factory1.createXvaCalculator().calculate();

        factory2.createPvCalculator().calculate();
        factory2.createXvaCalculator().calculate();
    }
}
