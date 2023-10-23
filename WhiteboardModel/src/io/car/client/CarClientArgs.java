package io.car.client;

import io.car.Car;
import io.car.Color;
import io.car.Make;
import io.car.Model;

import java.util.Arrays;

class CarClientArgs {
    public static void main(String[] args) {
        // if invalid input
        if (args.length < 4) {
            String usage = "Usage: java CarClientArgs <year> <color> <make> <model>";
            String example = "Example: java CarClientArgs 1990 yellow toyota tacoma";
            String note1 = "Valid years are: " + Car.MIN_YEAR + " to " + Car.MAX_YEAR;
            String note2 = "Valid colors are: " + Arrays.toString(Color.values());
            String note3 = "Valid makes are: " + Arrays.toString(Make.values());
            String note4 = "Valid models are: " + Arrays.toString(Model.values());

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            System.out.println(note4);
            return;
        }
        // valid input
        System.out.println(Arrays.toString(args));

        int y = Integer.parseInt(args[0]);
        Color c = Color.valueOf(args[1].toUpperCase());
        Make ma = Make.valueOf(args[2].toUpperCase());
        Model mo = Model.valueOf(args[3].toUpperCase());

        Car newCar = new Car(y, c, ma, mo);
        System.out.println(newCar);
    }
}