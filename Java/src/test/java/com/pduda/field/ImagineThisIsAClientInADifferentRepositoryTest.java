package com.pduda.field;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImagineThisIsAClientInADifferentRepositoryTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();

        assertThat(client.formattedTotalPrice(50)).isEqualTo("Total price is 50 euro");
    }

}
