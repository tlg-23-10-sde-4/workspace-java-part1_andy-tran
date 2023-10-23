package edu.math;

// all static class
import java.lang.Math;

class Calculator {

    private Calculator() {

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static boolean isEven (double val) {
        return val % 2 == 0;
    }

    public static int randomInt() {
        double rand = Math.random();
        double scaled = (rand * 19) + 1;
        return (int) scaled;
    }

    public static int randomInt(int min, int max) {
        double rand = Math.random();
        double scaled = rand * (max - min +1);
        double raised = scaled + min;
        return (int) raised;
    }

    public static double average(int first, int... rest) {
        double sum = first;
        for(int val: rest) {
            sum += val;
        }
        return sum / (rest.length +1);
    }
}