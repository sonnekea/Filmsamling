 public class Controller {
        private MovieCollection movieList;

        public Controller() {
            movieList = new MovieCollection();
        }
        public void addMovie(String title, String director, int year, boolean color, int minute, String genre) {
            movieList.addMovie(title, director, year, color, minute, genre);
        }
        public void printCollection() {
            movieList.printMyCollection();
        }
        public void printMovie (int i) {
            movieList.printMovie(i);
        }
        public int searchMovie(String title) {
            return movieList.searchMovie(title);
        }
        public Movie getMovie(int movieNumber) {
            return movieList.getMovie(movieNumber);
        }
        public void editMovie (int i, String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
            movieList.editMovie(i, title, director, year, Color, lengthInMinutes, genre);
        }
    }

