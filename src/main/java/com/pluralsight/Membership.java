package com.pluralsight;

import java.math.BigDecimal;

public class Membership {
    private String name;
    private int months;
    private BigDecimal baseRate;

    public Membership(String name, int months, BigDecimal baseRate) {
        this.name = name;
        this.months = months;
        this.baseRate = baseRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }


}
