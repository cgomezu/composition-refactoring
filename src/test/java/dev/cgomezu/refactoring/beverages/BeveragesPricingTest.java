package dev.cgomezu.refactoring.beverages;

import dev.cgomezu.refactoring.beverages.additions.Cream;
import dev.cgomezu.refactoring.beverages.additions.Milk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Product coffee = new Coffee();
        assertEquals(coffee.price(), 1.20);
    }

    @Test
    public void computes_coffee_with_milk_price() {
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(new Coffee(), new Milk());
        assertEquals(coffeeWithMilk.price(), 1.30);
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        CoffeeWithMilkAndCream coffeeWithMilkAndCream = new CoffeeWithMilkAndCream(
                new CoffeeWithMilk(new Coffee(), new Milk()),
                new Cream());
        assertEquals(coffeeWithMilkAndCream.price(), 1.45);
    }

}