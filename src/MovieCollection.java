import java.util.ArrayList;

public class MovieCollection {
    protected ArrayList<Movie> allMovies;

    public MovieCollection() {
        allMovies = new ArrayList<>();
        allMovies.add(new Movie("Hunger Games", "Gary Ross", 2012, true, 142, "SCIFI"));
    }

    public void printMyCollection() {
        for (int i = 0; i < allMovies.size(); i++) {
            Movie m = allMovies.get(i);
            System.out.println(m.toString());
        }
    }

    public void addMovie(String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
        allMovies.add(new Movie(title, director, year, Color, lengthInMinutes, genre));
    }

    public void printMovie(int i) {
        if (i < allMovies.size() && i >= 0) {
            System.out.println(allMovies.get(i));

        } else {
            System.out.println("Venligst indtast et nummer mellem 0 " + "og " + allMovies.size());
        }
    }

    public int searchMovie(String title) {
        int count = 0;
        System.out.println("Søg i resultaterne");
        for (Movie m: allMovies) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                count++;
                System.out.println(m.toString());
            }
        }
        if (count == 0) { //if count 0=no movies found.
            System.out.println("Ingen film fandtes.");
        }
        return count;
    }

    public void editMovie(int i, String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
        Movie m = allMovies.get(i);
        m.setTitle(title);
        m.setDirector(director);
        m.setYear(year);
        m.setColor(Color);
        m.setLengthInMinutes(lengthInMinutes);
        m.setGenre(genre);
    }
    public Movie getMovie(int movieNumber) {
        return allMovies.get(movieNumber);
    }
}