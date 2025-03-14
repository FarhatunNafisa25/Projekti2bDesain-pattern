package modul1.latihan;

public class GanjilDoWhile {
    public static void main(String[] args){
        System.out.println("Bilangan ganjil dari 1 hingga 20 (menggunakan do-while):");
        int i=1;
        do{
            System.out.print(i + " ");
            i +=2;
        }while(i<=20);
    }
}
