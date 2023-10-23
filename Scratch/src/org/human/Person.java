package org.human;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//
// immutable class. A class definition written in such a way that instances once created can't have
// properties changed... no methods to do so
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
    returns the persons age in whole years.
    */

    public int getAge(LocalDate birthDate) {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}