import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie[] movies = {new Movie("war","action",8.0),
                new Movie("chucky","crime",8.5),
                new Movie("Housefull 5 ","funny",7.1),
                new Movie("Annabelle" , "horror",8.0),
                new Movie("Avenger","sci-fi",9.2),
                new Movie("hera pheri","funny",9.0),
                new Movie("you","crime",8.0),
                new Movie("1920" ,"horror",7.8),
                new Movie("Singham","action",7.6)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the genre of movie : ");
        String inputGenre = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Movie movie : movies) {
            if (movie.genre.equalsIgnoreCase(inputGenre)){
                movie.displayMovie();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Movies of this genre not available");
        }

        Movie highRating = movies[0];
        for (int i = 0 ; i < movies.length ; i++) {
                if (movies[i].rating > highRating.rating) {
                    highRating = movies[i];
                }
        }

        System.out.println();
        System.out.println("Highest Rating movie Details : ");
        highRating.displayMovie();

        scanner.close();


    }
}