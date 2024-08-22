import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Database database = new Database();

    public static void main(String[] args) {
        populateDatabase();  // Poblar la base de datos con contenido
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("\n** Bienvenido a SENA Viewer **");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Selecciona una opción: ");

            option = getValidIntInput(scanner, 0, 6);

            switch (option) {
                case 1:
                    showMovies(scanner);
                    break;
                case 2:
                    showSeries(scanner);
                    break;
                case 3:
                    showBooks(scanner);
                    break;
                case 4:
                    showMagazines(scanner);
                    break;
                case 5:
                    Report.generateGeneralReport(database);
                    break;
                case 6:
                    System.out.println("Función de reporte diario aún no implementada.");
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
    }

    private static void showMovies(Scanner scanner) {
        System.out.println("\n** Lista de Películas **");
        int index = 1;
        for (Movie movie : database.getMovies()) {
            System.out.println(index + ". " + movie.getTitle());
            index++;
        }
        System.out.print("Selecciona una película para ver (0 para regresar): ");
        int selectedIndex = getValidIntInput(scanner, 0, database.getMovies().size());
        if (selectedIndex > 0) {
            Movie movie = database.getMovies().get(selectedIndex - 1);
            movie.view(movie.getDuration());
        }
    }

    private static void showSeries(Scanner scanner) {
        System.out.println("\n** Lista de Series **");
        int index = 1;
        for (Series series : database.getSeries()) {
            System.out.println(index + ". " + series.getTitle());
            index++;
        }
        System.out.print("Selecciona una serie para ver (0 para regresar): ");
        int selectedIndex = getValidIntInput(scanner, 0, database.getSeries().size());
        if (selectedIndex > 0) {
            Series series = database.getSeries().get(selectedIndex - 1);
            series.view(series.getTimeViewed());  // Aquí deberías ajustar el tiempo visualizado
        }
    }

    private static void showBooks(Scanner scanner) {
        System.out.println("\n** Lista de Libros **");
        int index = 1;
        for (Book book : database.getBooks()) {
            System.out.println(index + ". " + book.getTitle());
            index++;
        }
        System.out.print("Selecciona un libro para leer (0 para regresar): ");
        int selectedIndex = getValidIntInput(scanner, 0, database.getBooks().size());
        if (selectedIndex > 0) {
            Book book = database.getBooks().get(selectedIndex - 1);
            book.view(book.getTimeViewed());
        }
    }

    private static void showMagazines(Scanner scanner) {
        System.out.println("\n** Lista de Revistas **");
        int index = 1;
        for (Magazine magazine : database.getMagazines()) {
            System.out.println(index + ". " + magazine.getTitle());
            index++;
        }
        System.out.print("Selecciona una revista para leer (0 para regresar): ");
        int selectedIndex = getValidIntInput(scanner, 0, database.getMagazines().size());
        if (selectedIndex > 0) {
            Magazine magazine = database.getMagazines().get(selectedIndex - 1);
            magazine.view(magazine.getTimeViewed());
        }
    }

    private static int getValidIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.print("Por favor, ingrese un número válido (" + min + " - " + max + "): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada no válida. Ingrese un número: ");
            }
        }
        return input;
    }

    private static void populateDatabase() {
        // Aquí se añaden ejemplos de películas, series, libros y revistas a la base de datos
        Movie movie1 = new Movie(1, "Inception", "Sci-Fi", "Christopher Nolan", 148, 2010);
        database.addMovie(movie1);

        Series series1 = new Series(2, "Breaking Bad", "Crime, Drama", "Vince Gilligan", 49, 2008, 5);
        Chapter chapter1 = new Chapter(1, "Pilot", 58, 2008, 1);
        series1.addChapter(chapter1);
        database.addSeries(series1);

        Book book1 = new Book(3, "El Quijote", new Date(), "Francisco de Robles", "1234567890");
        database.addBook(book1);

        Magazine magazine1 = new Magazine(4, "National Geographic", new Date(), "National Geographic Partners");
        database.addMagazine(magazine1);
    }
}