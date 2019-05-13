package factory.factorymethod;


import factory.ICalculator4PV;

public interface ICalculatorFactory {

    ICalculator4PV creatPvCalculator();
}
