package factory;


import factory.factorymethod.CRSCalculatorFactory;
import factory.factorymethod.ICalculatorFactory;
import factory.factorymethod.IRSCalculatorFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICalculatorFactory factory1 = new IRSCalculatorFactory();
        ICalculatorFactory factory2 = new CRSCalculatorFactory();

        ICalculator4PV calculator1 = factory1.creatPvCalculator();
        ICalculator4PV calculator2 = factory2.creatPvCalculator();

        calculator1.calculate();
        calculator2.calculate();
    }
}
