package com.example.storet;

public class theDate {
    int months;
    int years;
    int days;
    public theDate(int months, int days, int years){
        this.months = months;
        this.days = days;
        this.years = years;
    }

    @Override
    public String toString() {
        return months+"/"+days+"/"+years;
    }
}
