package com.pduda.field;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ShoppingCartTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        assertThat( shoppingCart.numberOfProducts()).isEqualTo(1);
    }

    @Test
    public void singleItem_totalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        assertThat(shoppingCart.calculateTotalPrice()).isEqualTo(10);
    }

    @Test
    public void singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        assertThat(shoppingCart.hasDiscount()).isTrue();
    }

    @Test
    public void singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        assertThat(shoppingCart.hasDiscount()).isFalse();
    }

}
