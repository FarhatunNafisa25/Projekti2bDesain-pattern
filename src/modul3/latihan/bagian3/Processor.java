package modul3.latihan.bagian3;

public class Processor {
    private String merk;
    private double kecepatanGHz;

    public Processor(String merk, double kecepatanGHz) {
        this.merk = merk;
        this.kecepatanGHz = kecepatanGHz;
    }

    public void jalankan() {
        System.out.println("Processor " + merk + " berjalan pada " + kecepatanGHz + " GHz");
    }
}
