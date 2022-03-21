package com.pduda.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImagineThisIsAClientInADifferentRepositoryTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();

        assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }

}
