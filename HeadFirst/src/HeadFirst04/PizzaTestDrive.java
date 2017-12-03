package HeadFirst04;

import HeadFirst04.Pizza.Pizza;
import HeadFirst04.PizzaStore.NYPizzaStore;
import HeadFirst04.PizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }
}
