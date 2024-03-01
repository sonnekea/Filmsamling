import java.util.Scanner;

    public class UserInterface {
        Scanner input = new Scanner(System.in);
        Controller movieController = new Controller();

        public void startProgram() {
            int userChoice = 0;
            int sentinel = 6;

            while (userChoice < sentinel) {
                userChoice = movieMenu();

                if (userChoice == 1) {
                    addMovie();

                } else if (userChoice == 2) {
                    movieController.printCollection();

                } else if (userChoice == 3) {
                    int movieNumber = getMovieNumber();
                    movieController.printMovie(movieNumber);

                } else if (userChoice == 4) {
                    String title = getTitle();
                    movieController.searchMovie(title);
                } else if (userChoice == 5) {
                    editMovie();
                } else if (userChoice >= sentinel) {
                    System.out.println("Afsluttet");
                }
            }
        }

        private int movieMenu() {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Tilføj en film.");
            System.out.println("2. Se min filmsamling.");
            System.out.println("3. Se enkelt film.");
            System.out.println("4. Søg på film.");
            System.out.println("5. Rediger film.");
            int userChoice = input.nextInt();
            return userChoice;
        }

        private void addMovie() {
            input.nextLine();
            System.out.println("Titel: ");
            String title = input.nextLine();

            System.out.println("Instruktør: ");
            String director = input.nextLine();

            System.out.println("År: ");
            int year = input.nextInt();

            boolean color = false;
            System.out.println("Farvefilm? ja/nej");
            String erIFarve = input.next();
            erIFarve = erIFarve.toLowerCase();
            if (erIFarve.equals("yes")) {
                color = true;
            }

            System.out.println("Spilletid i minutter: ");
            int minute = input.nextInt();

            System.out.println("Genre: ");
            String genre = input.next();

            movieController.addMovie(title, director, year, color, minute, genre);
        }

        private int getMovieNumber() {
            System.out.println("Hvilken film vil du printe?");
            int movieNumber = input.nextInt();
            return movieNumber;
        }

        private String getTitle() {
            System.out.println("Søg på en titel.");
            String title = input.next();
            return title;
        }

        public void editMovie() {
            System.out.println("Skriv ID'et på den film du ønsker at redigere.");
            int movieNumber = input.nextInt();
            input.nextLine();
            String nejTak = "nej";
            movieController.printMovie(movieNumber);
            Movie m = movieController.getMovie(movieNumber);
            System.out.println("Vil du ændre titlen? Hvis ja, skriv ny titel. Hvis nej, skriv 'nej'.");
            String titleEdit = input.nextLine();
            if (titleEdit != nejTak) {
                m.setTitle(titleEdit);
            } else {
                titleEdit = m.getTitle();
            }
            System.out.println("Vil du ændre instruktøren? Hvis ja, skriv ny instruktør. Hvis nej, skriv 'nej'.");
            String directorEdit = input.nextLine();
            if (directorEdit != nejTak) {
                m.setDirector(directorEdit);
            } else {
                directorEdit = m.getDirector();
            }

            System.out.println("Vil du ændre årstallet? Hvis ja, skriv nyt årstal. Hvis nej, tast 0.");
            int yearEdit = input.nextInt();
            input.nextLine();
            if (yearEdit != 0) {
                m.setYear(yearEdit);
            } else {
                yearEdit = m.getYear();
            }

            System.out.println("Vil du ændre farvefilm? Hvis ja, skriv ja for farve og nej for sort/hvid.");
            boolean colorEdit = input.nextBoolean();
            if (colorEdit != m.getColor()) {
                m.setColor(colorEdit);
            }

            System.out.println("Vil du ændre filmens lændge? Hvis ja, skriv ny længde. Hvis nej, tast 0.");
            int lengthEdit = input.nextInt();
            input.nextLine();
            if (lengthEdit != 0) {
                m.setLengthInMinutes(lengthEdit);
            } else {
                lengthEdit = m.getLengthInMinutes();
            }

            System.out.println("Vil du ændre genren? Hvis ja, skriv ny titel. Hvis nej, skriv 'nej'.");
            String genreEdit = input.nextLine();
            if (genreEdit != nejTak) {
                m.setGenre(genreEdit);
            } else {
                genreEdit = m.getGenre();
            }
            movieController.editMovie(movieNumber, titleEdit, directorEdit, yearEdit, colorEdit, lengthEdit, genreEdit);
        }
    }

