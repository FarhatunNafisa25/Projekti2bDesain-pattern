package modul3.latihan.bagian3;

public class Main {
    public static void main(String[] args) {
        Processor amd = new Processor("AMD Ryzen 7", 3.2);
        RAM ddr5 = new RAM(32, "DDR5");
        Laptop laptop = new Laptop("ZenBook Pro", amd, ddr5);

        laptop.hidupkan();
    }
}

