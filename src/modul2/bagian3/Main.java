package modul2.bagian3;

public class Main {
    public static void main(String[] args){
        AksesModifier contoh = new AksesModifier();
        contoh.tampilkan();
        System.out.println(contoh.publicVar); //Error:privateVar memiliki akses pribadi
    }
}
