package com.entertainment;
// business class to model a tv

import java.util.Arrays;

public class Television {
    // properties/ attributes/ fields
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String [] VALID_BRANDS = {"Toshiba", "Samsung", "Sony", "TCL"};

    private static int instanceCount = 0;

    private int volume = 1;
    private String brand;
    private DisplayType display = DisplayType.LED;

    // for muting behavior
    private int temp;
    private boolean isMute;

    //constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        setBrand(brand);
    }

    public Television(int volume, String brand) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(volume, brand);
        setDisplay(display);
    }

    // methods/ functions
    public void mute() {
        isMute = !isMute;
        if (isMute == true) {
            temp = getVolume();
            setVolume(MIN_VOLUME);
        } else {
            setVolume(temp);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println(brand + " TV turning on... volume is " + volume);
    }

    public void turnOff() {
        System.out.println(brand + " TV turning off... volume is " + volume);
    }

    // getters and setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume " + volume + " not in range of 0 - 100.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        boolean valid = false;
        if(isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand: " + brand + " Must be one of " + Arrays.toString(VALID_BRANDS));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if(brand.equals(currentBrand)) {
                return true;
                //valid = true;
                //break;
            }
        }
        return false;
    }

    public String toString() {
        return String.format("Television: brand=%s, volume=%s, display=%s",
                getBrand(), getVolume(), getDisplay());

        // return getBrand() + " volume = " + getVolume() + " display is: " + getDisplay();
    }
}