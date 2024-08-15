
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
    }