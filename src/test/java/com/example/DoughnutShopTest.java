package com.example;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class PinkJammieMock implements Doughnut {
    public String prepare() {
        return "A Zac's favourite doughnut from Gregg's";
    }
}


public class DoughnutShopTest {

    private final Map<String, Doughnut> registeredDoughnuts = new HashMap<>();

    @Test
    public void testPrepareDoughnut_forChocolate() {
        String doughnutType = "Chocolate";

        registeredDoughnuts.put(doughnutType, new ChocolateDoughnut());

        DoughnutShop shop = new DoughnutShop(registeredDoughnuts);

        Doughnut doughnut = shop.prepareDoughnut(doughnutType);

        assertEquals("A delicious chocolate doughnut prepared!", doughnut.prepare());
    }

    @Test
    public void testPrepareDoughnut_forPinkJammie() {
        String doughnutType = "PinkJammie";

        registeredDoughnuts.put(doughnutType, new PinkJammieMock());

        DoughnutShop shop = new DoughnutShop(registeredDoughnuts);

        Doughnut doughnut = shop.prepareDoughnut(doughnutType);

        assertEquals("A Zac's favourite doughnut from Gregg's", doughnut.prepare());
    }

    // And so on for the other tests..
}
