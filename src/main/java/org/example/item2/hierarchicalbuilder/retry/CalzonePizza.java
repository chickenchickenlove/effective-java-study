package org.example.item2.hierarchicalbuilder.retry;

public class CalzonePizza extends Pizza{
    private final boolean sauceInside;

    // static 클래스로 선언해야 사용가능함.
    // Builder는 자기 자신, Pizza.Builder는 Pizza 클래스에 선언되 Builder 클래스.
    public static class Builder extends Pizza.Builder<Builder> {

        // 구체 클래스만의 필드
        private boolean sauceInside;

        // 구체 클래스만의 메서드
        // Self로 자기 자신(구체 Builder) 반환해서 메서드 가능함.
        public Builder sauceInside() {
            this.sauceInside = true;
            return self();
        }

        // CalzonePizza를 생성하도록 한다. 그래야 Pizza 대신 가능해짐.
        @Override
        CalzonePizza build() {
            return new CalzonePizza(this);
        }

        // 자기 자신(구체 빌더)를 반환함.
        @Override
        protected Builder self() {
            return this;
        }
    }

    public CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
