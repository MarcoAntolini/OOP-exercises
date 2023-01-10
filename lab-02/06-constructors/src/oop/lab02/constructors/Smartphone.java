package oop.lab02.constructors;

public class Smartphone {

    public static final boolean DEF_HAS_GPS = true;
    public static final boolean DEF_HAS_3G = true;
    public static final boolean DEF_HAS_NFC = true;
    public static final int DEF_SD_SIZE = 8192;
    public static final int DEF_RAM_SIZE = 1024;
    public static final int DEF_N_CPU = 2;

    public int nCPU;
    public int ram;
    public int sdSize;
    public String brand;
    public String model;
    public boolean hasGPS;
    public boolean has3G;
    public boolean hasNFC;

    public Smartphone(int nCPU, int ram, int sdSize, String brand, String model, boolean hasGPS, boolean has3g,
            boolean hasNFC) {
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3g;
        this.hasNFC = hasNFC;
    }

    public Smartphone(String brand, String model) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, boolean hasGPS, boolean has3g) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3g, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public void printStringRep() {
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        Smartphone smartphone1 = new Smartphone("HTC", "One", 1024);
        Smartphone smartphone2 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        Smartphone smartphone3 = new Smartphone("Apple", "iPhone 5S", false);
        Smartphone smartphone4 = new Smartphone("Google", "Nexus 4", true, true);
        smartphone1.printStringRep();
        smartphone2.printStringRep();
        smartphone3.printStringRep();
        smartphone4.printStringRep();
    }
}
