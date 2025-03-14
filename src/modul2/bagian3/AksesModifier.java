package modul2.bagian3;

public class AksesModifier {
    public int publicVar=1;
    private int privateVar=2;
    protected int protectedVar=3;
    int defaultVar=4; //default

    public void tampilkan(){
        System.out.println("Public: "+publicVar);
        System.out.println("Private: "+privateVar);
        System.out.println("Protected: " +protectedVar);
        System.out.println("Default: "+defaultVar);
    }
}
