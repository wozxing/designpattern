package factory.factorymethod;

import factory.ICalculator4PV;
import factory.IRSCalculator4PV;

public class IRSCalculatorFactory implements ICalculatorFactory {

    public ICalculator4PV creatPvCalculator() {
        return new IRSCalculator4PV();
    }
}
