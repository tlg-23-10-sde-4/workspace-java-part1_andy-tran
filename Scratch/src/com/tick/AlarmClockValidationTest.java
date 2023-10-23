package com.tick;//
// client side main class focused on validation testing
// BVT (boundary value testing) - test on boundaries and just outside them

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // should be accepted
        System.out.println(clock.getSnoozeInterval());

        clock.setSnoozeInterval(AlarmClock.MAX_INTERVAL);
        System.out.println(clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);
        System.out.println(clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);
        System.out.println(clock.getSnoozeInterval());
    }
}