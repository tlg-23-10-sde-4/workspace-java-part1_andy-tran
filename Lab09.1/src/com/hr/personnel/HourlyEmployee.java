package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    // variables
    double rate;
    double hours;

    // constructors
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid " + (getRate() * getHours()) + " a week.");
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getHours() * getRate()) * HOURLY_TAX_RATE);
    }

    // getters and setters
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

    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + getRate() +
                ", hours=" + getHours();
    }
}