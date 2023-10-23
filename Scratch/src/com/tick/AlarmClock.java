package com.tick;/*
Class definition to model the workings of an alarm clock.
this is called a business class or system class as it contains business things
 */

class AlarmClock {
    // static variables only one copy of these, owned by whole class not 1 single instance.
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    private int snoozeInterval = 5;

    public AlarmClock() {
        // no op method
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for any validation/ conversion
    }

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". must be between " + MIN_INTERVAL +
                    " and " + MAX_INTERVAL);
        }
    }

    public void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");
    }

    public String toString() {
        return "com.tick.AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}