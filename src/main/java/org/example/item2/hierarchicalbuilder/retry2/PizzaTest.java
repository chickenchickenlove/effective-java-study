package org.example.item2.hierarchicalbuilder.retry2;


public class PizzaTest {

    public static void main(String[] args) {

        CalzonePizza.Builder builder = new CalzonePizza.Builder(CalzonePizza.Size.M)
                .addToppings(Pizza.Topping.A);


    }

}
