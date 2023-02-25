package org.example.item2.hierarchicalbuilder.retry2;

import java.util.EnumSet;

public class Pizza {

    public enum Topping {A, B, C, D,}

    private final EnumSet<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addToppings(Topping topping) {
            toppings.add(topping);
            return self();
        }

        protected abstract T self();
        public abstract Pizza build();
    }

    public Pizza(Builder<?> builder) {
        this.toppings = builder.toppings;
    }
}
