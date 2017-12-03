package HeadFirst04.PizzaStore;

import HeadFirst04.Pizza.NYStyleCheesePizze;
import HeadFirst04.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizze();
        }else {
            return null;
        }
    }
}
