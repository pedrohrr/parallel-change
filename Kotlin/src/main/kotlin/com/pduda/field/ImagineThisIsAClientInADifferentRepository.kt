package com.pduda.field

class ImagineThisIsAClientInADifferentRepository {
    fun formattedTotalPrice(price: Int): String {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(price)
        return String.format("Total price is %d euro", shoppingCart.calculateTotalPrice())
    }
}