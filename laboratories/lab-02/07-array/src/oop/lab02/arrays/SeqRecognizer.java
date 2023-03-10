package oop.lab02.arrays;

public class SeqRecognizer {

    public static boolean checkSeq1(final int[] array) {
        int i = 0;
        for (; i < array.length && array[i] == 1; i++)
            ;
        for (; i < array.length && (array[i] == 2 || array[i] == 3); i++)
            ;
        return i == array.length;
    }

    public static boolean checkSeq2(final int[] array) {
        int i = 0;
        if (array[i] != 1)
            return false;
        i++;
        for (; i < array.length && array[i] == 2; i++)
            ;
        if (i == array.length || array[i] != 3)
            return false;
        return true;
    }

    public static boolean checkSeq3(final int[] array) {
        int i = 0;
        if (array[i] != 1)
            return false;
        i++;
        for (; i < array.length && array[i] == 2; i++)
            ;
        if (i == array.length || array[i] != 3)
            return false;
        i++;
        for (; i < array.length && array[i] == 4; i++)
            ;
        if (i != array.length) {
            if (array[i] != 5)
                return false;
            i++;
        }
        if (i != array.length)
            return false;
        return true;
    }

    public static boolean testCheckSeq1() {
        return checkSeq1(new int[] { 1, 1 })
                && checkSeq1(new int[] { 1, 1, 1, 2 })
                && checkSeq1(new int[] { 1, 1, 1, 2, 3, 2, 3 })
                && !checkSeq1(new int[] { 1, 1, 1, 2, 3, 1, 3 })
                && !checkSeq1(new int[] { 3, 2, 1, 1 });
    }

    public static boolean testCheckSeq2() {
        return checkSeq2(new int[] { 1, 3 })
                && checkSeq2(new int[] { 1, 2, 3 })
                && checkSeq2(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 })
                && !checkSeq2(new int[] { 1, 2, 2 })
                && !checkSeq2(new int[] { 2, 2, 2, 2, 3 });
    }

    public static boolean testCheckSeq3() {
        return checkSeq3(new int[] { 1, 3 })
                && checkSeq3(new int[] { 1, 3, 5 })
                && checkSeq3(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 })
                && checkSeq3(new int[] { 1, 2, 3, 4, 5 })
                && checkSeq3(new int[] { 1, 2, 2, 3, 4, 4, 4, 5 })
                && !checkSeq3(new int[] { 2, 2, 3, 4, 4, 4 })
                && !checkSeq3(new int[] { 1, 2, 2, 3, 4, 4, 4, 5, 6 });
    }

    public static void main(final String[] args) {
        System.out.println("testCheckSeq1: " + testCheckSeq1());
        System.out.println("testCheckSeq2: " + testCheckSeq2());
        System.out.println("testCheckSeq3: " + testCheckSeq3());
    }
}
