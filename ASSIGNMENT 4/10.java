class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Industry: " + industry);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
    }

    public static void main(String[] args) {
        Movie m = new Movie();

        String n = "3 Idiots";
        String g = "Comedy Drama";
        double r = 8.4;

        m.name = n;
        m.genre = g;
        m.rating = r;

        m.display();
    }
}