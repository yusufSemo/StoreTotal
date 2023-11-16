package com.example.storet;

import java.time.LocalDate;

public class DayTotal {
    private final theDate date;
    private final float cash;
    private final float online;
    private final float card;


    public DayTotal(theDate date, float cash, float online, float card){
        this.date = date;
        this.cash = cash;
        this.online= online;
        this.card = card;
        String weekDay = getWeekDay();
    }
    public String getWeekDay() {
        LocalDate myDate = LocalDate.of(date.years, date.months, date.days);
        return myDate.getDayOfWeek().name();
    }

    public float getTotal() {
        return cash + online + card;
    }

    public float getCash() {
        return cash;
    }
    public float getCard() {
        return card;
    }
    public float getOnline() {
        return online;
    }
    public String getDate() {
        return date.toString();
    }
}
