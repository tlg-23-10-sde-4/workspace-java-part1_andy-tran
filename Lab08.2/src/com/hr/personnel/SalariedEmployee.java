package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    // parameters
    double salary;

    // constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401K();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid " + getSalary() + " per year.");
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", salary=" + getSalary();
    }
}