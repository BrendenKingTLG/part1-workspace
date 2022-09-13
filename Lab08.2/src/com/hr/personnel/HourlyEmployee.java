package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {

        super(name, hireDate);
    }

    //implement constructor that takes salary

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setHours(hours);
        setRate(rate);

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



    //override toString()
    @Override
    public String toString() {
        return String.format("%s, Rate=%s, Hours=%s", super.toString(), getRate(), getHours());
        //"Employee: " + "name=" + getName() + ", hireDate=" + getHireDate() + ", Rate=" + getRate() + ", Hours=" + getHours();
    }
}
