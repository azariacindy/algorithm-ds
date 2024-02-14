import java.util.ArrayList;

public class practice106 {

    public static void displayNumberSeries() {
        for (int i = 1; i <= 15; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 != 0) {
                    System.out.print("*" + i + "* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(); // Move to the next line after printing the series
    }

    public static void calculateAverageRating(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            int sum = 0;
            for (int rating : movie.getRatings()) {
                sum += rating;
            }
            double average = (double) sum / movie.getRatings().size();
            movie.setAverageRating(average);
        }
    }

    public static void findHighestAndLowestAverageRating(ArrayList<Movie> movies) {
        Movie highestRated = null;
        Movie lowestRated = null;
        double highestAverage = -1;
        double lowestAverage = Double.POSITIVE_INFINITY;

        for (Movie movie : movies) {
            if (movie.getAverageRating() > highestAverage) {
                highestAverage = movie.getAverageRating();
                highestRated = movie;
            }
            if (movie.getAverageRating() < lowestAverage) {
                lowestAverage = movie.getAverageRating();
                lowestRated = movie;
            }
        }

        System.out.println("Film dengan rata-rata rating tertinggi: " + highestRated.getTitle());
        System.out.println("Film dengan rata-rata rating terendah: " + lowestRated.getTitle());
    }

    public static void main(String[] args) {
        displayNumberSeries();

        // Sample movie data
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Film A", new int[]{4, 5, 3}));
        movies.add(new Movie("Film B", new int[]{3, 2, 4}));
        movies.add(new Movie("Film C", new int[]{5, 4, 5}));

        calculateAverageRating(movies);
        findHighestAndLowestAverageRating(movies);
    }
}

class Movie {
    private String title;
    private ArrayList<Integer> ratings;
    private double averageRating;

    public Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = new ArrayList<>();
        for (int rating : ratings) {
            this.ratings.add(rating);
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
