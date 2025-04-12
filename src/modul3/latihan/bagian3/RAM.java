package modul3.latihan.bagian3;

public class RAM {

    private int kapasitasGB;
    private String tipe;

    public RAM(int kapasitasGB, String tipe) {
        this.kapasitasGB = kapasitasGB;
        this.tipe = tipe;
    }

    public void baca() {
        System.out.println("RAM " + tipe + " membaca data");
    }

    public void tulis() {
        System.out.println("RAM " + tipe + " menulis data");
    }
}
