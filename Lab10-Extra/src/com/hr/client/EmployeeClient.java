package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee emp = new Employee("Andy");
        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e.getMessage()); // reason string
            System.out.println(e.getCause()); // extract the nested cause
            e.printStackTrace();
        }
    }
}