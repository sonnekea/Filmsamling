public class Movie {
        private String title;
        private String director;
        private int year;
        private boolean Color;
        private int lengthInMinutes;
        private String genre;

        public Movie(String title, String director, int year, boolean isInColor, int lengthInMinutes, String genre) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.Color = isInColor;
            this.lengthInMinutes = lengthInMinutes;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public String getDirector() {
            return director;
        }

        public int getYear() {
            return year;
        }

        public boolean getColor() {
            return Color;
        }

        public int getLengthInMinutes() {
            return lengthInMinutes;
        }

        public String getGenre() {
            return genre;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setColor(boolean color) {
            Color = color;
        }

        public void setLengthInMinutes(int lengthInMinutes) {
            this.lengthInMinutes = lengthInMinutes;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        @Override
        public String toString() {
            String farve;
            if (this.getColor()) {
                farve = "Filmen er i farve";
            } else {
                farve = "Filmen er sort/hvid";
            }
            return "Titel: " + this.getTitle() + "\n" +
                    "Instruktør: " + this.getDirector() + "\n" +
                    "År: " + this.getYear() + "\n" +
                    farve +
                    "Spilletid: " + this.getLengthInMinutes() + "\n" +
                    "Genre: " + this.getGenre() + "\n";
        }
    }

