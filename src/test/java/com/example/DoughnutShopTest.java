package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoughnutShopTest {

    @Test
    public void testPrepareDoughnut_forChocolate() {
        DoughnutShop shop = new DoughnutShop();

        String result = shop.prepareDoughnut("Chocolate");

        assertEquals("A delicious chocolate doughnut prepared!", result);
    }

    @Test
    public void testPrepareDoughnut_forCinnamon() {
        DoughnutShop shop = new DoughnutShop();

        String result = shop.prepareDoughnut("Cinnamon");

        assertEquals("A delicious cinnamon doughnut prepared!", result);
    }

    @Test
    public void testPrepareDoughnut_forSugar() {
        DoughnutShop shop = new DoughnutShop();

        String result = shop.prepareDoughnut("Sugar");

        assertEquals("A delightful sugar doughnut prepared!", result);
    }

    @Test
    public void testPrepareDoughnut_forUnknownType() {
        DoughnutShop shop = new DoughnutShop();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            shop.prepareDoughnut("Unknown");
        });

        String expectedMessage = "We do not produce this type of doughnut";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
