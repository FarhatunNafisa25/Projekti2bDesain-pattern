package modul3.bagian3.pewarisan;

class Mobil extends Kendaraan{
    int jumlahPintu;

    void displayInfoMobil(){
        displayInfo();
        System.out.println("Jumlah Pintu: "+ jumlahPintu);
    }
}
