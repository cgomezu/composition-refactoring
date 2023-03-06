package dev.cgomezu.refactoring.beverages;


import dev.cgomezu.refactoring.beverages.additions.Milk;

final class CoffeeWithMilk implements Product {

    private Coffee coffe;
    private Milk milk;

    CoffeeWithMilk(Coffee coffe, Milk milk) {
        this.coffe = coffe;
        this.milk = milk;
    }


    @Override
    public double price() {
        return coffe.price() + milk.price();
    }
}
