package dev.cgomezu.refactoring.beverages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverages coffee = new Coffee();
        assertEquals(coffee.price(), 1.20);
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new CoffeeWithMilk();
        assertEquals(coffeeWithMilk.price(), 1.30);
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffeeWithMilkAndCream = new CoffeeWithMilkAndCream();
        assertEquals(coffeeWithMilkAndCream.price(), 1.45);
    }

}