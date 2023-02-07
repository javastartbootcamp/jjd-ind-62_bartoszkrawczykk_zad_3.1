package pl.javastart.task;

public class Table {
    String size;
    String color;
    double height;

    Table(String si, String co, double he) {
        size = si;
        color = co;
        height = he;
    }

    void printInfo() {
        System.out.println(size + " " + color + " " + height + "cm");
    }
}
