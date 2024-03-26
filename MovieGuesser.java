public class MovieGuesser {

    // Method to perform binary search to find the target movie
    public static String binarySearch(String[] movies, String target) {
        // Variables to keep track of the search range
        int low = 0; // Starting index of the search range
        int high = movies.length - 1; // Ending index of the search range

        // Loop until the search range is valid
        while (low <= high) {
            // Calculate the middle index of the search range
            int mid = (low + high) / 2;

            // Get the movie guess at the middle index
            String guess = movies[mid];

            // Check if the guess is equal to the target movie
            if (guess.equals(target)) {
                return "Found it! Your friend was thinking of " + guess + ".";
            }
            // If the guess comes before the target movie alphabetically
            else if (guess.compareTo(target) < 0) {
                // Adjust the search range to the right half
                low = mid + 1;
            }
            // If the guess comes after the target movie alphabetically
            else {
                // Adjust the search range to the left half
                high = mid - 1;
            }
        }

        // If the loop exits without finding the target movie
        return "Sorry, couldn't find the movie your friend was thinking of.";
    }

    // Main method to test the binarySearch method
    public static void main(String[] args) {
        // List of sorted movies
        String[] movies = { "Avengers", "Frozen", "Jumanji", "Lion King", "Titanic" };

        // Target movie your friend is thinking of
        String targetMovie = "Jumanji";

        // Perform binary search to find the target movie
        String result = binarySearch(movies, targetMovie);

        // Print the result of the search
        System.out.println(result);
    }
}
