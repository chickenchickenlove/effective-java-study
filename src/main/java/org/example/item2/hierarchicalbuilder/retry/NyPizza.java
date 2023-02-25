package org.example.item2.hierarchicalbuilder.retry;

public class NyPizza extends Pizza{

    public enum Size {S, M, L}

    private final Size size;


    public static class Builder extends Pizza.Builder<Builder> {

        private Size size;

        public Builder (Size size) {
            this.size = size;
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
