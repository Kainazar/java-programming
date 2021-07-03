package allDaysJava.day06_arithmetic_operators;

public class MovieTheather {
    public static void main(String[] args) {
        String movieName, genre, releaseDate;
        int rottenTomateosRating;
        double rating, duration;
        boolean isSequels, isOnDvd;

        movieName = "2020";
        genre = "Apocalypse";
        releaseDate = "09/20/2020";
        rating = 7.8;
        duration = 1.45;
        rottenTomateosRating = 80;
        isSequels = true;
        isOnDvd = true;

        System.out.println("********WELCOME TO THE CINEMA***********");
        System.out.println();
        System.out.println("* Tonight we are streaming \"" + movieName +"\" which was released on " + releaseDate + ".*" );
        System.out.println("* This " + genre + "movie got a " + rottenTomateosRating + "% rating on RottenTomatoes.\t\t\t");
        System.out.println("* The rating " + rating + "* and it runs for " + duration + " hrs.\t\t\t");
        System.out.println("* The is a seguel - " + isSequels + "and is on DvD " + isOnDvd + ".\t\t\t");
        System.out.println();
        System.out.println("*********** WATCH WITH POPCORN *********************");

    }
}
