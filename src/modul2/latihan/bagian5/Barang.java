package modul2.latihan.bagian5;

public class Barang {
    private String namaBarang;
    private double harga;

    //Default Constructor
    public Barang(){
        namaBarang="Pensil";
        harga=12.000;
    }
    //Parameterized Construktor
    public Barang(String namaBarang,double harga){
        this.namaBarang=namaBarang;
        this.harga=harga;
    }
    //Method
    public void tampilkanInfo(){
        System.out.println("Nama Barang: "+namaBarang);
        System.out.println("Harga Barang: "+harga);
    }
}
