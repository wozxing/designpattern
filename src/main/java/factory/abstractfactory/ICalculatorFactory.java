package factory.abstractfactory;


import factory.ICalculator4PV;
import factory.ICalculator4Xva;

public interface ICalculatorFactory {

    public ICalculator4PV createPvCalculator();

    public ICalculator4Xva createXvaCalculator();
}
