package oop.lab02.arrays;

import oop.lab02.constructors.Smartphone;

public class PlayWithSmartphoneArrays {

    static int search(final Smartphone[] array, final String brand) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].brand.equals(brand)) {
                result++;
            }
        }
        return result;
    }

    static int search(final Smartphone[] array, final boolean hasNFC, final boolean hasGPS) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].hasNFC == hasNFC && array[i].hasGPS == hasGPS) {
                result++;
            }
        }
        return result;
    }

    static int search(final Smartphone[] array, final int nCPUs, final int sdSize, final boolean has3G) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].nCPU == nCPUs && array[i].sdSize == sdSize && array[i].has3G == has3G) {
                result++;
            }
        }
        return result;
    }

    public static void main(final String[] args) {
        Smartphone smartphone1 = new Smartphone("HTC", "One", 1024);
        Smartphone smartphone2 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        Smartphone smartphone3 = new Smartphone("Apple", "iPhone 5S", false);
        Smartphone smartphone4 = new Smartphone(2, 1024, 0, "Google", "Nexus 4", true, false, true);
        Smartphone smartphone5 = new Smartphone(2, 512, 8192, "Acer", "Liquid", true, false, true);
        Smartphone[] smartphones = new Smartphone[] { smartphone1, smartphone2, smartphone3, smartphone4, smartphone5 };
        System.out.println("Smartphones with 2 CPUs and 8GB of RAM: " + search(smartphones, 2, 8192, false));
        System.out.println("Smartphones with 4 CPUs and 8GB of RAM and 3G: " + search(smartphones, 4, 8192, true));
        System.out.println("Smartphones with NFC and GPS: " + search(smartphones, true, true));
        System.out.println("Smartphones from Apple: " + search(smartphones, "Apple"));
    }
}
