package oop.lab02.arrays;

public class MyCircularArray {

    public static final int ARRAY_DEF_SIZE = 10;
    int[] array;
    int index;

    public MyCircularArray(int size) {
        this.array = new int[size];
    }

    public MyCircularArray() {
        this(ARRAY_DEF_SIZE);
    }

    public void add(final int elem) {
        this.array[this.index] = elem;
        this.index++;
        if (this.index == this.array.length) {
            this.index = 0;
        }
    }

    public void reset() {
        this.index = 0;
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
        this.index = 0;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {
        MyCircularArray array = new MyCircularArray();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        array.printArray();
        for (int i = 11; i <= 15; i++) {
            array.add(i);
        }
        array.printArray();
        array.reset();
        array.printArray();
        for (int i = 25; i <= 120; i += 5) {
            array.add(i);
        }
        array.printArray();
    }
}
