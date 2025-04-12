package modul3.latihan.bagian4.overriding;

class Persegi extends BangunDatar {
    private double sisi;

    // Constructor untuk Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Override method hitungLuas() untuk Persegi
    @Override
    void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}
