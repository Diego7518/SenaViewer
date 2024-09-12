import java.util.List;

public class Report {
    public static void generateGeneralReport(DataBase db) {
        System.out.println("\n*** Reporte General de Contenidos Vistos ***\n");
        printContentList(db.getMovies());
        printContentList(db.getBooks());
        printContentList(db.getSeries());
        printContentList(db.getMagazines());
    }

    public static void generateTodayReport(DataBase db) {
        System.out.println("\n*** Reporte Diario de Contenidos Vistos ***\n");
        // Lógica para el reporte diario basado en la fecha actual
        printContentList(db.getMovies());
        printContentList(db.getBooks());
        printContentList(db.getSeries());
        printContentList(db.getMagazines());
    }

    private static void printContentList(List<? extends Media> contentList) {
        for (Media content : contentList) {
            if (content.isViewed()) {
                System.out.println(content.getTitle());
            }
        }
    }
}
