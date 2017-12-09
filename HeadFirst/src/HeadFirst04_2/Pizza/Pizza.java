package HeadFirst04_2.Pizza;

import HeadFirst04_2.Ingredient.Dough;
import HeadFirst04_2.Ingredient.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minute at 350");
    }

    public void cut(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
