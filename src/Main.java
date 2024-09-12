import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMainMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    showMovies(db);
                    break;
                case 2:
                    showSeries(db);
                    break;
                case 3:
                    showBooks(db);
                    break;
                case 4:
                    showMagazines(db);
                    break;
                case 5:
                    Report.generateGeneralReport(db);
                    break;
                case 6:
                    Report.generateTodayReport(db);
                    break;
                case 0:
                    System.out.println("Gracias por usar Sena Viewer.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (option != 0);
    }

    private static void showMainMenu() {
        System.out.println("\n*** Sena Viewer ***");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opción: ");
    }

    private static void showMovies(DataBase db) {
        System.out.println("\n*** Lista de Películas ***");
        for (Movie movie : db.getMovies()) {
            System.out.println(movie.toString());
        }
    }

    private static void showSeries(DataBase db) {
        System.out.println("\n*** Lista de Series ***");
        for (Serie serie : db.getSeries()) {
            System.out.println(serie.toString());
        }
    }

    private static void showBooks(DataBase db) {
        System.out.println("\n*** Lista de Libros ***");
        for (Book book : db.getBooks()) {
            System.out.println(book.toString());
        }
    }

    private static void showMagazines(DataBase db) {
        System.out.println("\n*** Lista de Revistas ***");
        for (Magazine magazine : db.getMagazines()) {
            System.out.println(magazine.toString());
        }
    }
}
