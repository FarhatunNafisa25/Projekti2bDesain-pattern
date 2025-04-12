package modul3.latihan.bagian3;

public class Laptop {
    // Atribut
    private String merk;
    private Processor processor;
    private RAM ram;

    // Konstruktor
    public Laptop(String merk, Processor processor, RAM ram) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
    }

    // Metode
    public void hidupkan() {
        System.out.println("Menghidupkan laptop " + merk);
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}
