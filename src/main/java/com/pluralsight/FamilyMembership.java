package com.pluralsight;

import java.math.BigDecimal;

public class FamilyMembership extends Membership{
    private int extraMembers;

    public FamilyMembership(String name, int months, BigDecimal baseRate, int extraMembers) {
        super(name, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }
}
