package modul3.latihan.bagian4.overriding;

class Lingkaran extends BangunDatar {
    private double jariJari;

    // Constructor untuk Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Override method hitungLuas() untuk Lingkaran
    @Override
    void hitungLuas() {
        double luas = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }
}