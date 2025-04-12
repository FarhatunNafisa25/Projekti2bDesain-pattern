package modul2.latihan.bagian5;

public class Main {
    public static void main(String[] args){
        //Membuat objek menggunakan Default Constructor
        System.out.println("Barang 1");
        Barang barang1=new Barang();
        barang1.tampilkanInfo();
        //Membuat objek menggunakan Parameterized Constructor
        System.out.println("Barang 2");
        Barang barang2=new Barang("Buku",15.000);
        barang2.tampilkanInfo();
    }
}
