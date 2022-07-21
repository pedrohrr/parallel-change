package com.pduda.field

class ShoppingCart {
    private var prices = listOf<Int>();
    fun add(price: Int) {
        this.prices = this.prices.plus(price);
    }

    fun calculateTotalPrice(): Int {
        return prices.sum()
    }

    fun hasDiscount(): Boolean {
        return prices.sum() >= 100
    }

    fun numberOfProducts(): Int {
        return prices.size
    }
}