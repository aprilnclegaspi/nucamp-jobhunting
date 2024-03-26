public class DayAbbreviation {

    // Method to get the abbreviation of a day based on its full name
    public static String getAbbreviation(String fullName) {
        // Variable to store the abbreviation
        String abbreviation;

        // Switch statement to check the full name and assign the abbreviation
        // accordingly
        switch (fullName) {
            case "Sunday":
                abbreviation = "Sun";
                break;
            case "Monday":
                abbreviation = "Mon";
                break;
            case "Tuesday":
                abbreviation = "Tue";
                break;
            case "Wednesday":
                abbreviation = "Wed";
                break;
            case "Thursday":
                abbreviation = "Thu";
                break;
            case "Friday":
                abbreviation = "Fri";
                break;
            case "Saturday":
                abbreviation = "Sat";
                break;
            // Default case if the provided day name is not recognized
            default:
                abbreviation = "Invalid Day";
                break;
        }

        // Return the abbreviation
        return abbreviation;
    }

    // Main method to test the getAbbreviation method
    public static void main(String[] args) {
        // Define the day for which we want to find the abbreviation
        String day = "Friday";

        // Print the abbreviation for the specified day
        System.out.println("Abbreviation for " + day + ": " + getAbbreviation(day));
    }
}
