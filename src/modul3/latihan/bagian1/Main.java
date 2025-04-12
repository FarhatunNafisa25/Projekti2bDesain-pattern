package modul3.latihan.bagian1;

public class Main {
    public static void main(String[]args){
        //Membuat objek
        Buku buku1= new Buku();
        buku1.judul="Laskar Pelangi";
        buku1.penulis="Pelangi";
        buku1.tahunTerbit=2005;

        //Memanggil metode
        buku1.displayInfo();
    }
}
