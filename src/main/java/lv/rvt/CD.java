package lv.rvt;

public class CD implements Packable {
    private String artist;
    private String title;
    private int year;
    private static final double WEIGHT = 0.1;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public double weight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}