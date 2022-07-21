package com.pduda.field

class ShoppingCart {
    private var price = 0
    fun add(price: Int) {
        this.price = price
    }

    fun calculateTotalPrice(): Int {
        return price
    }

    fun hasDiscount(): Boolean {
        return price >= 100
    }

    fun numberOfProducts(): Int {
        return 1
    }
}