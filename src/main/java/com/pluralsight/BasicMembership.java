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
}
