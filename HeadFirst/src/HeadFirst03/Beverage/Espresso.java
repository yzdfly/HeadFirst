package HeadFirst03.Beverage;

import HeadFirst03.Beverage.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso(){
        description = "Espresso";
    }
}
