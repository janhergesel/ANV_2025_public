package com.mycompany.cafeapp;

public class CustomDrink {
    private String base;
    private boolean milk;
    private boolean sugar;
    private boolean caramel;

    private CustomDrink(Builder b) {
        this.base = b.base;
        this.milk = b.milk;
        this.sugar = b.sugar;
        this.caramel = b.caramel;
    }

    public String toString() {
        return DrinkFactory.createDrink(base).serve() +
                (milk ? ", milk" : "") +
                (sugar ? ", sugar" : "") +
                (caramel ? ", caramel" : "");
    }

    public static class Builder {
        private String base;
        private boolean milk, sugar, caramel;

        public Builder(String base) {
            this.base = base;
        }

        public Builder milk() {
            this.milk = true;
            return this;
        }

        public Builder sugar() {
            this.sugar = true;
            return this;
        }

        public Builder caramel() {
            this.caramel = true;
            return this;
        }

        public CustomDrink build() {
            return new CustomDrink(this);
        }
    }
}