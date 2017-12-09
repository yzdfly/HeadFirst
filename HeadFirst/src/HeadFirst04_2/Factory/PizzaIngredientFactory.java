package HeadFirst04_2.Factory;

import HeadFirst04_2.Ingredient.Dough;
import HeadFirst04_2.Ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
