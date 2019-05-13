package factory.abstractfactory;


import factory.CRSCalculator4PV;
import factory.CRSCalculator4Xva;
import factory.ICalculator4PV;
import factory.ICalculator4Xva;

public class CRSCalculatorFactory implements ICalculatorFactory {

    public ICalculator4PV createPvCalculator() {
        return new CRSCalculator4PV();
    }

    public ICalculator4Xva createXvaCalculator() {
        return new CRSCalculator4Xva();
    }
}
