package factory.abstractfactory;


import factory.ICalculator4PV;
import factory.ICalculator4Xva;
import factory.IRSCalculator4PV;
import factory.IRSCalculator4Xva;

public class IRSCalculatorFactory implements ICalculatorFactory {

    public ICalculator4PV createPvCalculator() {
        return new IRSCalculator4PV();
    }

    public ICalculator4Xva createXvaCalculator() {
        return new IRSCalculator4Xva();
    }
}
