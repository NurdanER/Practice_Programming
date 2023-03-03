package day05_tasks;

public class Movie {
    public static void main(String[] args) {

        String movieName = "AVATAR: THE WAY OF WATER";
        String genre = "Action/Adventure";
        double durationHours = 3.16;     // 3 hours and 10 minutes. To write in double datatype 10/60 = 16
        String releaseDate = "Dec 16, 2022";
        String rating = "PG-13";
        boolean isASequelsOrNot = true;
        double rottenTomatoesRating = 76;
        boolean isOnDvd = true;

        System.out.println("------ Welcome to the Cinema ------" +  "\nTonight we are streaming " + movieName + " which was released on " +
                releaseDate + "." + "\nThis " + genre + " movie got " + rottenTomatoesRating + " on Rotten Tomatoes." + "\nThe rating is " +
                rating + " and it runs for " + durationHours + " hours." + "\nThis is a sequel " + isASequelsOrNot + " and is on dvd " +
                isOnDvd + "." );





    }
}
