package modul2.bagian6;

public class Buku {
    //Atribut (Private)
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    //Constructor (default)
    public Buku(){
        this.judul= "Unknown";
        this.pengarang= "unknown";
        this.tahunTerbit= 0;
    }
    public Buku(String judul,String pengarang,int tahunTerbit){
        this.judul= judul;
        this.pengarang= pengarang;
        this.tahunTerbit= tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    //Method untuk menampilkan informasi buku
    public void tampilkanInfo(){
        System.out.println("Judul       : "+judul);
        System.out.println("Pengarang   : "+pengarang);
        System.out.println("Tahun Terbit: "+ tahunTerbit);
        System.out.println("_____________________________");
    }
}
