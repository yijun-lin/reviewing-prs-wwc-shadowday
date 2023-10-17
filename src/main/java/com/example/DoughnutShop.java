package com.example;

public class DoughnutShop {

    public String prepareDoughnut(String doughnutType) {
        String preparedDoughnut;

        if (doughnutType.equals("Chocolate")) {
            preparedDoughnut = "A delicious chocolate doughnut prepared!";
        } else if (doughnutType.equals("Cinnamon")) {
            preparedDoughnut = "A delicious cinnamon doughnut prepared!";
        } else if (doughnutType.equals("Sugar")) {
            preparedDoughnut = "A delightful sugar doughnut prepared!";
        } else {
            throw new IllegalArgumentException("We do not produce this type of doughnut");
        }

        return preparedDoughnut;
    }
}
