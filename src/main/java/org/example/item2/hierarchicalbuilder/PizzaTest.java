package org.example.item2.hierarchicalbuilder;

// 코드 2-6 칼초네 피자 - 계층형 빌더를 활용한 하위 클래스 (20~21쪽)
public class PizzaTest{
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside().build();
    }
}
