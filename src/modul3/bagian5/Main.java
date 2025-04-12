package modul3.bagian5;

interface Terbang {
    void terbang();
}

// Abstract Class
abstract class Hewan {
    String name;

    abstract void bersuara();
}

// Class yang mewarisi abstract class dan mengimplementasikan interface
class Burung extends Hewan implements Terbang {
    @Override
    void bersuara() {
        System.out.println("Kicau kicau!");
    }

    @Override
    public void terbang() {
        System.out.println(name + " sedang terbang.");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.name = "Merpati";
        burung.bersuara();
        burung.terbang();
    }
}