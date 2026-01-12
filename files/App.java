public class App {

    public static String[] getWeekends(String format) {
        // BEGIN (write your solution here)
        switch (format) {
            case "short":
                String[] weekendShort = { "sat", "sun" };
                return weekendShort;

            default:
                String[] weekendFull = { "saturday", "sunday" };
                return weekendFull;
        }
        // END
    }
}
