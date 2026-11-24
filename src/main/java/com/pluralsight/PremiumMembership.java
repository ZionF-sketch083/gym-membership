package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership{
    private int guestPasses;

    public PremiumMembership(String name, int months, BigDecimal baseRate, int guestPasses) {
        super(name, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        BigDecimal price = getBaseRate();
        price = price.add(BigDecimal.valueOf(18.50));
        return price;
    }

    @Override
    public String toString() {
        return "PremiumMembership{" +
                "guestPasses=" + guestPasses +
                '}';
    }
}
