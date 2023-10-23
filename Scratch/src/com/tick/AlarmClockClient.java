package com.tick;// creates a few instances of com.tick.AlarmClock and give them a basic test drive

class AlarmClockClient {

    // app starting point
    public static void main(String[] args) {

        // create and instance of alarmclock and set its properties
        AlarmClock clock1 = new AlarmClock();
        AlarmClock clock2 = new AlarmClock(10);
        clock1.setSnoozeInterval(12);
        clock1.snooze();
        clock1.setSnoozeInterval(25);
        clock1.snooze();
    }
}