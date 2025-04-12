package modul3.latihan.bagian2;

public class Main {
    public static void main(String[]args){
        Motor motor1= new Motor();
        motor1.setMerek("Yamaha");
        motor1.setTahun(2005);

        System.out.println("Nama Merek: "+motor1.getMerek());
        System.out.println("Tahun: "+motor1.getTahun());

    }
}
