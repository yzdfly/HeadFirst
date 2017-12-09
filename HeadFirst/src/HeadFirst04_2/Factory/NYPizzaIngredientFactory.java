package HeadFirst04_2.Factory;

import HeadFirst04_2.Ingredient.Dough;
import HeadFirst04_2.Ingredient.MarinaraSauce;
import HeadFirst04_2.Ingredient.Sauce;
import HeadFirst04_2.Ingredient.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
}
