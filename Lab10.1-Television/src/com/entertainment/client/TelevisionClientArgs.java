package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }

        // convert strings to proper types
        String b = null;
        int v = 0;
        DisplayType d = null;
        try {
            b = String.valueOf(args[0]);
            v = Integer.parseInt(args[1]);
            d = DisplayType.valueOf(args[2].toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("There's been an error with your inputs: ");
            System.out.println("You entered: \n" + args[0] + " " + args[1] + " " + args[2]);
            printUsage();
            return;
        }

        try {
            // create tv object from above 3 variables
            Television newTV = new Television(b, v, d);

            // congratulate them on their order and show tv
            System.out.println("Congrats on the order, it'll be there soon!");
            System.out.println(newTV);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // extracts the thrower's reason string
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = "Valid brands are: " + Arrays.toString(Television.VALID_BRANDS);
        String note2 = "Volume must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}