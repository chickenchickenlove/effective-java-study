package org.example.item2.hierarchicalbuilder.retry2;

public class CalzonePizza extends Pizza{

    public enum Size{M,L, A,}

    private final Size size;


    public static class Builder extends Pizza.Builder<Builder> {
        private Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }
    }

    public CalzonePizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

}
