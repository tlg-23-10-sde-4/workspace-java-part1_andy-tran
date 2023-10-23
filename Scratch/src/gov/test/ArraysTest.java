package gov.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 56;
        ages[1] = 50;
        ages[2] = 9;
        ages[3] = 9;

        for (int age : ages) {
            System.out.println("The age is " + age);
        }
        System.out.println("This array has " + ages.length + " values");
        System.out.println(Arrays.toString(ages));

        double[] temps = {63.3, 88.0, 73.0, 66.2, 70.2};
        for (double temp : temps) {
            System.out.println("The current temperature is: " + temp);
        }
        System.out.println(Arrays.toString(temps));

        String[] names = {"Andy", "May", "Mac", "Bag"};
        System.out.println(Arrays.toString(names));
    }
}