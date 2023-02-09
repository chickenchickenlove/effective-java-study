package org.example.item2.builder;

public class NutritionFacts {
    private final int servingSize; // Required
    private final int servings; // Required
    private final int calories; // Option
    private final int fat; // Option
    private final int sodium; // Option
    private final int carbohydrate; // Option

    /**
     * 생성자 체이닝
     * - 매개변수가 적은 쪽에서 많은 쪽의 생성자를 this로 호출해준다.
     * - 의미없는 반복 변수를 줄여준다.
     */

    public static class Builder {
        private final int servingSize; // Required
        private final int servings; // Required
        private int calories = 0; // Option
        private int fat = 0; // Option
        private int sodium = 0; // Option
        private int carbohydrate = 0; // Option

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this; // builder 자체를 리턴해준다.
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        // builder는 fluent API 형태다. ... 찍으면서 유연하게 흘러가는 API임.
        // 장점 :
        // - 만들 때, 필수 속성에 대한 것을 설정할 수 있다.
        // - 선택적인 값은 추가해도 되고 안해도 됨.
        // - 객체도 안정적으로 사용할 수 있음.
        // 결과적으로 자바 빈즈 장점 + 생성자 체이닝 장점을 모두 사용할 수 있다.
        // 모든 경우에 빌더가 적절하진 않음. 빌더는 코드를 이해하기 어렵게 만든다.
        // 그리고 빌더를 만들기 위해서 필요한 코드의 양도 많고 중복되는 양도 많다.
        // 따라서 모든 경우에 빌더를 사용하는 것이 좋은 것은 아니다.
        // 필수적이고 필수적이지 않은 필드가 있고, 매개변수가 너무 많아서 생성자가 늘어나는 경우 + 불변 객체를 생성하고 싶을 때는 빌더를 써볼 법하다.
        // 어노테이션 프로세서 : 어노테이션은 주석 같은 존재(정보)다. 컴파일 하는 시점에 어노테이션을 읽어서 코드를 조작하는 기능을 자바가 제공해준다. 이것이 어노테이션 프로세서다.
        // 롬복은 어노테이션 프로세서인데, @builder를 읽어서 builder 코드를 만들어준다.
        // 롬복을 사용하면 좀 더 사용할만하다. 롬복의 장점 : 간결하다. (어노테이션 하나로만 가능하다)
        // 롬복의 단점 : 기본적으로 모든 파라미터를 받는 생성자가 기본으로 생긴다.--> 이 부분은 @AllArgsConstructor(access = PRIVATE)으로 선언해서 사용할 수 있다.
        // 롬복의 단점 : 필수값을 지정해 줄 수 없다. (직접 생성하면, 필수값을 빌더에 넣어주고 나머지를 메서드 체이닝으로 할 수 있었음) 그런데 그렇게 할 수 없었음.

        NutritionFacts cocaCola = new Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }


}
