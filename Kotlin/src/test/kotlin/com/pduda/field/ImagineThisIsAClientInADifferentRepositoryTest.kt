package com.pduda.field

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ImagineThisIsAClientInADifferentRepositoryTest {
    @Test
    @Throws(Exception::class)
    fun singleItem_numberOfProductsInTheCart() {
        val client = ImagineThisIsAClientInADifferentRepository()
        Assertions.assertThat(client.formattedTotalPrice(50)).isEqualTo("Total price is 50 euro")
    }
}