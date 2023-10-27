package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;
import jdk.swing.interop.SwingInterOpUtils;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }
    // BUSINESS METHODS
    /*
     OPTION 1: TRY CATCH AND HANDLE. EXCEPTION STOPS HERE.
     we use finally to guarantee the stop() gets called
        public void goToWork() {
            Car c = new Car("abc123", "Subaru", "Crosstrek");
            try {
                c.start();
                c.moveTo("West Seattle");
            } catch (DestinationUnreachableException e) {
                System.out.println(e); // toString() of DestinationUnreachableException auto called (or e.getMessage())
            } finally {
                c.stop();
            }
        }
    */

    /*
     OPTION 2: PUNT, DON'T DEAL WITH IT
     try finally here to make sure stop() gets called, no catch = no handling
        public void goToWork() throws DestinationUnreachableException {
            Car c = new Car("abc123", "Subaru", "Crosstrek");
            try {
                c.start();
                c.moveTo("West Seattle");
            } finally {
                c.stop();
            }
        }
    */

    // OPTION 3: Try-catch-finally, this time we'll catch the exception, "respond" in some way then re-throw
    // finally is for stop() call guarantee
    /*
    public void goToWork() throws DestinationUnreachableException{
        Car c = new Car("abc123", "Subaru", "Crosstrek");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use the javaMail API to send email complaint
            throw e;
        } finally {
            c.stop();
        }
    }
    */

    // OPTION 4: try-catch the exception, then throw a different one.
    // instead of throwing transportation oriented exception, we'll throw an HR oriented exception
    // more suitable for HR client
    public void goToWork() throws WorkException {
        Car c = new Car("abc123", "Subaru", "Crosstrek");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        } finally {
            c.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}