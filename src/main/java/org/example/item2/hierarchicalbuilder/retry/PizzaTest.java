package org.example.item2.hierarchicalbuilder.retry;

public class PizzaTest {

    public static void main(String[] args) {
        NyPizza pizza1 = new NyPizza.Builder(NyPizza.Size.M)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ONION)
                .build();

        CalzonePizza pizza2 = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();
    }
}
