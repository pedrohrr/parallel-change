package com.pduda.field

object LocalClient {
    @JvmStatic
    fun main(args: Array<String>) {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(10)
        println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts())
        println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice())
        println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount())
    }
}