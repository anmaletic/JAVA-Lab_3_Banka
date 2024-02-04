import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Vlasnik v1 = new Vlasnik("1", "Ivo", "Ivic", "Maksimir 22");
        Vlasnik v2 = new Vlasnik("2", "Mate", "Matic", "Maksimir 11");

        // 1.
        Racun r1 = new Racun("1", v1);
        Racun r2 = new Racun("2", v2);

        System.out.printf("r1: " + r1 + "\n");
        System.out.printf("r2: " + r2 + "\n");
        System.out.println();

        // 2.
        r1.uplata(new Iznos(100.0, "HRK"));
        r2.isplata(new Iznos(90.0, "HRK"));

        System.out.printf("r1: " + r1 + "\n");
        System.out.printf("r2: " + r2 + "\n");
        System.out.println();

        // 3.
        Racun r3 = r1;

        System.out.printf("r1: " + r1 + "\n");
        System.out.printf("r2: " + r2 + "\n");
        System.out.printf("r3: " + r3 + "\n");
        System.out.println();

        // 4.
        r3.isplata(new Iznos(100.0, "HRK"));
        r2.uplata(new Iznos(200, "HRK"));

        System.out.printf("r1: " + r1 + "\n");
        System.out.printf("r2: " + r2 + "\n");
        System.out.printf("r3: " + r3 + "\n");
        System.out.println();

        // 5
        r3 = new Racun("3", v1);
        r3.uplata(new Iznos(250.0, "HRK"));

        System.out.printf("r1: " + r1 + "\n");
        System.out.printf("r2: " + r2 + "\n");
        System.out.printf("r3: " + r3 + "\n");
        System.out.println();
    }
}