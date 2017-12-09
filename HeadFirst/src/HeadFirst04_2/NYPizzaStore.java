package HeadFirst04_2;

import HeadFirst04_2.Factory.NYPizzaIngredientFactory;
import HeadFirst04_2.Factory.PizzaIngredientFactory;
import HeadFirst04_2.Pizza.CheesePizza;
import HeadFirst04_2.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
                new NYPizzaIngredientFactory();

        if(type.equals("Cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
