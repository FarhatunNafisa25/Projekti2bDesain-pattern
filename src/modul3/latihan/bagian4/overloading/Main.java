package modul3.latihan.bagian4.overloading;

public class Main {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        // Memanggil method tambah() dengan 2 parameter int
        System.out.println("Hasil tambah(5, 10): " + matematika.tambah(5, 10)); // Output: 15

        // Memanggil method tambah() dengan 3 parameter int
        System.out.println("Hasil tambah(5, 10, 15): " + matematika.tambah(5, 10, 15)); // Output: 30

        // Memanggil method tambah() dengan 2 parameter double
        System.out.println("Hasil tambah(3.5, 2.5): " + matematika.tambah(3.5, 2.5)); // Output: 6.0
    }
}
