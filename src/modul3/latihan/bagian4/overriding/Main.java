package modul3.latihan.bagian4.overriding;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi dan Lingkaran
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(7);

        // Memanggil method hitungLuas() dari masing-masing objek
        persegi.hitungLuas(); // Output: Luas Persegi: 25.0
        lingkaran.hitungLuas(); // Output: Luas Lingkaran: 153.93804002589985
    }
}
