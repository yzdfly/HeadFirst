package HeadFirst03;

import HeadFirst03.Beverage.Beverage;
import HeadFirst03.Beverage.Espresso;
import HeadFirst03.Beverage.HouseBlend;
import HeadFirst03.Decorator.Mocha;
import HeadFirst03.Decorator.Whip;

public class StartBuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ",$" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println("================");
        System.out.println(beverage1.getDescription()+ ",$" + beverage1.cost());
    }
}
