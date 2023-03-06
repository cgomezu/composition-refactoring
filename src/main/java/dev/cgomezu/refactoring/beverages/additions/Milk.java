package dev.cgomezu.refactoring.beverages.additions;

import dev.cgomezu.refactoring.beverages.Product;

public final class Milk implements Product {
    @Override
    public double price() {
        return 0.10;
    }
}
