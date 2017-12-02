package HeadFirst03.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend()
    {
        description = "HouseBlend";
    }
}
