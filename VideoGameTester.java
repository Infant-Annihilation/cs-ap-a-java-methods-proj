public class VideoGameTester {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Minecraft", 100, 9.0, true);

        VideoGame game2 = new VideoGame("Halo-Reach", 60, 8.5, true);

        VideoGame game3 = new VideoGame("Celeste", 25, 7.5, false);

        System.out.println("test toString()");
        System.out.println(game1.toString());
        System.out.println();

        System.out.println("test containsWord()");
        System.out.println(game1.containsWord("craft"));

        System.out.println(game1.containsWord("Fortnite"));
        System.out.println();

        System.out.println("test getSeriesName()");
        System.out.println(game2.getSeriesName());

        System.out.println(game3.getSeriesName());
        System.out.println();

        System.out.println("test hasTitle()");
        System.out.println(game1.hasTitle("Minecraft"));

        System.out.println(game1.hasTitle("minecraft"));
        System.out.println();

        System.out.println("test averageHoursPerDay()");
        System.out.println(game1.averageHoursPerDay(10));

        System.out.println(game1.averageHoursPerDay(0));
        System.out.println();

        System.out.println("test canPlayWithFriends()");
        System.out.println(game2.canPlayWithFriends());

        System.out.println(game3.canPlayWithFriends());
        System.out.println();

        System.out.println("test isHighlyRated()");
        System.out.println(game1.isHighlyRated(8.0));

        System.out.println(game3.isHighlyRated(8.0));
    }
}