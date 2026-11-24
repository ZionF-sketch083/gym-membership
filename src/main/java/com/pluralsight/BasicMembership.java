package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership{
    private boolean offPeakOnly;

    public BasicMembership(String name,
                           int months,
                           BigDecimal baseRate, boolean offPeakOnly) {
        super(name, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal price = getBaseRate();
        if (offPeakOnly){
            price = price.subtract(BigDecimal.valueOf(5.00));
        }

        return price;
    }

    @Override
    public String toString() {
        return "BasicMembership{" +
                "offPeakOnly=" + offPeakOnly +
                '}';
    }
}
