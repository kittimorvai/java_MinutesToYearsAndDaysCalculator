public class MinutesToYearsDaysCalculator {
    public static final long MINUTES_IN_YEAR = 60 * 24 * 365;

    public static void main(String[] args) {
        printYearsAndDays(7264547);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value.");
        } else {
            long days = (minutes % MINUTES_IN_YEAR) / (24 * 60);
            long years = minutes / MINUTES_IN_YEAR;

            String daysString = days + " d ";
            String yearsString = years + " y ";
            System.out.println(minutes + " min = " + yearsString + "and " + daysString);
        }

    }
}
