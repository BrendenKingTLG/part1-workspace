/*
        * This code is sample code, provided as-is, and we make no
        * warranties as to its correctness or suitability for any purpose.
        *
        * We hope that it's useful to you.  Enjoy.
        * Copyright LearningPatterns Inc.
        */

package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //field
    private double salary;

    //ctor
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    //B methods
    @Override
    public void pay() {
        super.pay();
    }

    @Override
    public String toString() {
        return String.format("%s, Salary=%,.2f", super.toString(), getSalary());
        //"Employee: " + "name=" + getName() + ", hireDate=" + getHireDate() + ", Salary=" + getSalary();
    }

    //get & set
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
