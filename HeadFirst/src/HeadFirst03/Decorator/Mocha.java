package HeadFirst03.Decorator;

import HeadFirst03.Beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
