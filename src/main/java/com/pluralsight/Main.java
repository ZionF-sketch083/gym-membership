package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Memberships ===");

        Membership membership = new Membership("Henry Clark", 3, BigDecimal.valueOf(30.00));

        System.out.println(membership.getMonthlyPrice());
    }
}
