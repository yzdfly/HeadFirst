package HeadFirst04_2;

import HeadFirst04_2.Pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("Cheese");
        System.out.println("Yzd ordered a " + pizza.getName());
    }
}
