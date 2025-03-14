package modul2.latihan.bagian1;

public class Main {
    public static void main(String[]args){
        //Membuat objek dari Class Buku
        Buku buku1=new Buku();
        //Mengisi nilai atribut
        buku1.judul= "Hujan";
        buku1.pengarang= "Tere Liye";
        //Menampilkan nilai atribut
        System.out.println("Judul    : " +buku1.judul);
        System.out.println("Pengarang: "+buku1.pengarang);

    }
}
