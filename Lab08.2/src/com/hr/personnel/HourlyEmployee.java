/*
        * This code is sample code, provided as-is, and we make no
        * warranties as to its correctness or suitability for any purpose.
        *
        * We hope that it's useful to you.  Enjoy.
        * Copyright LearningPatterns Inc.
        */

package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //fields
    private double rate;
    private double hours;

    //ctor
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {

        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setHours(hours);
        setRate(rate);

    }

    //b methods
    @Override
    public void pay() {
        super.pay();
    }

    @Override
    public String toString() {
        return String.format("%s, Rate=%s, Hours=%s", super.toString(), getRate(), getHours());
        //"Employee: " + "name=" + getName() + ", hireDate=" + getHireDate() + ", Rate=" + getRate() + ", Hours=" + getHours();
    }

    //generate setters and getters

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


}
