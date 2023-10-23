package org.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Andy", LocalDate.of(1996, 12, 27));

        System.out.println(p1);
        System.out.println(p1.getAge(p1.getBirthDate()));
    }
}