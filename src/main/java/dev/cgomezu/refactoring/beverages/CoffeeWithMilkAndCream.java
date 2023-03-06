package dev.cgomezu.refactoring.beverages;

import dev.cgomezu.refactoring.beverages.additions.Cream;

final class CoffeeWithMilkAndCream implements Product {

    private Cream cream;
    private CoffeeWithMilk coffeeWithMilk;

    public CoffeeWithMilkAndCream(CoffeeWithMilk coffeeWithMilk, Cream cream) {
        this.cream = cream;
        this.coffeeWithMilk = coffeeWithMilk;
    }

    @Override
    public double price() {
        return coffeeWithMilk.price() + cream.price();
    }
}
