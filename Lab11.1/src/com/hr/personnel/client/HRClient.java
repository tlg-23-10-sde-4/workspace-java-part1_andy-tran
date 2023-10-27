/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

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
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 70000.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 35, 40));
        dept.addEmployee(new SalariedEmployee("Mac", LocalDate.of(1996, 12, 27), 100000.0));
        dept.addEmployee(new HourlyEmployee("Mai", LocalDate.of(1998, 4,22), 50.0, 50.0));
        dept.addEmployee(new Executive("Andy", LocalDate.of(2020, 8, 20), 2500000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay all employees
        System.out.println("\nPay employees.");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break.");
        dept.holidayBreak();
    }
}