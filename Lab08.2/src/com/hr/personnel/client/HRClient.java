
package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 85000.42));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 85.21, 40));

        //create one sal and one hour employee, pass to addEmployee()
        dept.addEmployee((new SalariedEmployee("David", LocalDate.of(2020, 4, 4), 105000.54)));
        dept.addEmployee((new HourlyEmployee("John", LocalDate.of(2010, 6, 4), 53.5, 40)));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay its employees
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}