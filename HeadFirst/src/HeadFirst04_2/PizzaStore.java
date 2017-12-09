package HeadFirst04_2;

import HeadFirst04_2.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
