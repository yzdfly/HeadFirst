package HeadFirst03.Decorator;

import HeadFirst03.Beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+.79;
    }
}
