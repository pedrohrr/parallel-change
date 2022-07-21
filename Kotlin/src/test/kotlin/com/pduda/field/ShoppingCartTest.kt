package com.pduda.field

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ShoppingCartTest {
    @Test
    @Throws(Exception::class)
    fun singleItem_numberOfProductsInTheCart() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(10)
        Assertions.assertThat(shoppingCart.numberOfProducts()).isEqualTo(1)
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_totalPrice() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(10)
        Assertions.assertThat(shoppingCart.calculateTotalPrice()).isEqualTo(10)
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(100)
        Assertions.assertThat(shoppingCart.hasDiscount()).isTrue
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(99)
        Assertions.assertThat(shoppingCart.hasDiscount()).isFalse
    }
}