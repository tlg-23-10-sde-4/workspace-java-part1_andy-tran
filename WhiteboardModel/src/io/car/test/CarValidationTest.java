package io.car.test;

import io.car.Car;

class CarValidationTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setYear(1949);
        c1.setYear(2025);

        c1.setAvgMpg(100.0);
        c1.setAvgMpg(-1.4);

        c1.setMileage(1000000);
        c1.setMileage(-1);
    }
}