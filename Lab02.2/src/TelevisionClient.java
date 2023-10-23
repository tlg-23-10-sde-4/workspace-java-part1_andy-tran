
// main class: creates instances of television and tests them

class TelevisionClient {
    public static void main(String[] args) {
        // create an instance of television and set its properties
        Television tv1 = new Television(50, "TCL");
        Television tv2 = new Television();
        Television tv3 = new Television("LG");

        tv2.setBrand("Samsung");
        tv2.setVolume(12);

        tv1.setVolume(Television.MAX_VOLUME);
        tv2.setVolume(Television.MIN_VOLUME);

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(Television.getInstanceCount() + " instances");

        tv1.mute();
        System.out.println(tv1.getVolume());
        tv1.mute();
        System.out.println(tv1.getVolume());

        System.out.println(tv1);
    }
}