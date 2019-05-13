package factory.factorymethod;

import factory.CRSCalculator4PV;
import factory.ICalculator4PV;

public class CRSCalculatorFactory implements ICalculatorFactory {

    public ICalculator4PV creatPvCalculator() {
        return new CRSCalculator4PV();
    }
}
