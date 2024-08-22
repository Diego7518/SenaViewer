import java.util.List;

class Report {
    public static void generateGeneralReport(Database db) {
        System.out.println("\n** Reporte General de Contenidos Vistos **\n");
        printContentList(db.getMovies());
        printContentList(db.getBooks());
        printContentList(db.getSeries());
        printContentList(db.getMagazines());
    }

    private static void printContentList(List<? extends Media> contentList) {
        for (Media content : contentList) {
            if (content.isViewed()) {
                System.out.println(content.getTitle() + " - Tiempo visto: " + content.getTimeViewed() + " minutos");
            }
        }
    }
}