package io.car.client;

import io.car.Car;
import io.car.Color;
import io.car.Make;
import io.car.Model;

class CarClient {
    public static void main(String[] args) {
        // short constructor
        Car myCar = new Car(2022, Color.WHITE, Make.SUBARU, Model.CROSSTREK);
        myCar.setMileage(20000);
        myCar.setAvgMpg(28.4);
        myCar.setAwdOr4wd(true);

        // testing business methods
        System.out.println(myCar);
        myCar.crash();
        System.out.println(myCar);

        // full constructor
        Car yourCar = new Car(1996, Make.HONDA, Model.CIVIC, Color.BLUE,
                30.0, false, 100000);

        System.out.println();

        // testing business methods
        yourCar.startEngine();
        yourCar.speed();
        yourCar.allTerrainMode();
        System.out.println(yourCar.getIsAwdOr4wd());
        yourCar.stopEngine();
        System.out.println(yourCar);

    }
}