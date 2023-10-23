package net.flix;

public enum Genre {
    HORROR("HORROR"),
    ACTION("Action!"),
    HISTORICAL("Historical"),
    COMEDY("Comedy :)"),
    SPORTS_ROMANCE("Sports Romance <3"),
    WESTERN("Western");

    // everything under here is regular class definition stuff.

    private final String display;

    Genre(String display) { // auto private by definition
        this.display = display;
        // System.out.println("Genre ctor called");
    }

    public String display() { // standard getter, just not named get
        return display;
    }

    public String toString() {
        return display();         // generally better to call your own getter
    }
}