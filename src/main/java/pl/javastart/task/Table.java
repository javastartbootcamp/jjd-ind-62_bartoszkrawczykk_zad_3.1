package pl.javastart.task;

public class Table {
    String pen;
    String book;
    String lamp;

    Table(String pen1, String book1) {
        pen = pen1;
        book = book1;
    }

    void printInfo() {
        System.out.println(pen + " " + book);
    }
}
