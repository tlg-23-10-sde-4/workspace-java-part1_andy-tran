package io.car;

public class Car {

    public static final int MIN_MILEAGE = 0;
    public static final int MAX_MILEAGE = 999999;

    public static final double MIN_MPG = 0.0;
    public static final double MAX_MPG = 99.9;

    public static final int MIN_YEAR = 1950;
    public static final int MAX_YEAR = 2024;

    private Make make;
    private Model model;
    private Color color;
    private double avgMpg;
    private boolean isAwdOr4wd;
    private int mileage;
    private int year;

    //Constructors
    public Car() {
        //no op
    }

    // common car descriptor in english ex. 1996 Blue Honda Civic
    public Car(int year, Color color, Make make, Model model) {
        setYear(year);
        setColor(color);
        setMake(make);
        setModel(model);
    }

    public Car(int year, Make make, Model model, Color color, double avgMpg, boolean isAwdOr4wd, int mileage) {
        this(year, color, make, model);
        setAvgMpg(avgMpg);
        setMileage(mileage);
        setAwdOr4wd(isAwdOr4wd);
    }

    // Methods
    public void startEngine() {
        System.out.println(make + " " + model + " started!");
    }

    public void stopEngine() {
        System.out.println(make + " " + model + " stopped!");
    }

    public void crash() {
        System.out.println("WATCH OUT!!!!!");
        setMake(Make.CRASHED);
        setModel(Model.CRASHED);
        setColor(Color.CRASHED);
        setAvgMpg(0.0);
        setMileage(0);
        setAwdOr4wd(false);
    }

    public void speed() {
        System.out.println("Not the best idea...");
        setAvgMpg(getAvgMpg() / 2);
        System.out.println(getAvgMpg());
    }

    public void allTerrainMode() {
        if (getIsAwdOr4wd() == false) {
            setAwdOr4wd(true);
        }
    }

    // Getters and Setters


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1950 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println(year + " is not in the valid range of " + MIN_YEAR
                    + " to " + MAX_YEAR);
        }
    }

    public String getMake() {
        return make.toString();
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getModel() {
        return model.toString();
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getAvgMpg() {
        return avgMpg;
    }

    public void setAvgMpg(double avgMpg) {
        if (avgMpg >= MIN_MPG && avgMpg <= MAX_MPG) {
            this.avgMpg = avgMpg;
        } else {
            System.out.println(avgMpg + " not in MPG range " + MIN_MPG + " to " + MAX_MPG);
        }
    }

    public boolean getIsAwdOr4wd() {
        return isAwdOr4wd;
    }

    public void setAwdOr4wd(boolean awdOr4wd) {
        isAwdOr4wd = awdOr4wd;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage >= MIN_MILEAGE && mileage <= MAX_MILEAGE) {
            this.mileage = mileage;
        } else {
            System.out.println(mileage + " not in range " + MIN_MILEAGE + " to " + MAX_MILEAGE);
        }
    }

    public String toString() {
        return  "Year=" + getYear() +
                ", Color=" + getColor() +
                ", Make=" + getMake() +
                ", Model=" + getModel() +
                ", AvgMpg=" + getAvgMpg() +
                ", Mileage=" + getMileage() +
                ", isAWD/4WD=" + getIsAwdOr4wd();
    }
}