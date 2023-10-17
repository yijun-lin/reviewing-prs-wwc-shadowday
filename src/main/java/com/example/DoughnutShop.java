package com.example;

import java.util.Map;

public class DoughnutShop {
    private final Map<String, Doughnut> registeredDoughnuts;

    public DoughnutShop(Map<String, Doughnut> registeredDoughnuts) {
        this.registeredDoughnuts = registeredDoughnuts;
    }

    public Doughnut prepareDoughnut(String doughnutType) {
        Doughnut requestedDoughnut = registeredDoughnuts.get(doughnutType);

        if (requestedDoughnut == null) {
            throw new IllegalArgumentException("We do not produce this type of doughnut");
        }

        return requestedDoughnut;
    }
}
