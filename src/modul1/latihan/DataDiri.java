package modul1.latihan;

public class DataDiri {
    public static void main(String[] args) {
        // Deklarasi variabel
        int umur = 20;
        double tinggi = 1.56;
        boolean isPekerjaan = false;
        char jenisKelamin = 'P';
        String nama = "Farhatun Nafisa";
        String tempatLahir = "Lhokseumawe";
        String tanggalLahir = "25-01-2005";
        char golonganDarah = 'B';
        String agama = "Islam";

        System.out.println("Nama           : " + nama);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggi + " m");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Agama          : " + agama);
        System.out.println("Bekerja        : " + (isPekerjaan ? "Ya" : "Tidak"));
    }
}
