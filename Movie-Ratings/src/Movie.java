public class Movie {

    String title;
    String genre;
    double rating;

    Movie(String title, String genre,double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;

    }

    void displayMovie() {
        System.out.println();
        System.out.println("Movie Name : " + this.title);
        System.out.println("Movie Genre : " + this.genre);
        System.out.println("Movie Rating : " + this.rating);
    }


}
