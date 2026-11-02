public class VideoGame {
    private String title;
    private int hoursPlayed;
    private double rating;
    private boolean multiplayer;

    public VideoGame(String title, int hoursPlayed, double rating, boolean multiplayer) {
        this.title = title;
        this.hoursPlayed = hoursPlayed;
        this.rating = rating;
        this.multiplayer = multiplayer;
    }

    // returns info abt the game
    public String toString() {
        return "Title: " + title + ", Hours Played: " + hoursPlayed + ", Rating: " + rating + ", Multiplayer: " + multiplayer;
    }

    // checks whether the title contains a word
    public boolean containsWord(String word) {
        return title.indexOf(word) != -1;
    }

    // gets the part of the title before a dash
    public String getSeriesName() {
        int dash = title.indexOf("-");
        if (dash != -1) {
            return title.substring(0, dash).trim();
        }
        return title;
    }

    // checks whether the game has a specific title
    public boolean hasTitle(String otherTitle) {
        return title.equals(otherTitle);
    }

    // calculates the average hours played per day
    public double averageHoursPerDay(int days) {
        if (days <= 0) {
            return 0.0;
        }
        return (double) hoursPlayed / days;
    }

    // checks whether the game supports multiplayer
    public boolean canPlayWithFriends() {
        return multiplayer;
    }

    // checks whether the game meets a minimum rating
    public boolean isHighlyRated(double minimumRating) {
        return rating >= minimumRating;
    }
}