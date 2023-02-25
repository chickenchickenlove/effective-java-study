package org.example.item2.hierarchicalbuilder.retry;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    // Generic T 선언. 이 때 T는 Builder를 상속받은 클래스임.
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        // 공통 로직을 가짐. T를 반환함. 즉, 구체 Builder를 반환함.
        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        // Pizza를 반환함. 구체 클래스 타입 반환으로 오버라이딩 가능.
        abstract Pizza build();

        // 이 장치를 통해 T(구체 빌더)를 반환함.
        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
