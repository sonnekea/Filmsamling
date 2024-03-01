 public class Controller {
        private MovieCollection list;

        public Controller() {
            list = new MovieCollection();
        }
        public void addMovie(String title, String director, int year, boolean color, int minute, String genre) {
            list.addMovie(title, director, year, color, minute, genre);
        }
        public void printCollection() {
            list.printMyCollection();
        }
        public void printMovie (int i) {
            list.printMovie(i);
        }
        public int searchMovie(String title) {
            return list.searchMovie(title);
        }
        public Movie getMovie(int movieNumber) {
            return list.getMovie(movieNumber);
        }
        public void editMovie (int i, String title, String director, int year, boolean Color, int lengthInMinutes, String genre) {
            list.editMovie(i, title, director, year, Color, lengthInMinutes, genre);
        }
    }

