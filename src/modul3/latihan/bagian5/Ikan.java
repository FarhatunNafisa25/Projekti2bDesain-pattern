package modul3.latihan.bagian5;

class Ikan extends HewanAir implements Berenang {
    @Override
    void makan() {
        System.out.println(nama + " sedang makan plankton.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang di air.");
    }
}
