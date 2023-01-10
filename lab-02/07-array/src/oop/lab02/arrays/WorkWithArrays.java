package oop.lab02.arrays;

import java.util.Arrays;

public class WorkWithArrays {

    public static int countOccurrencies(final int[] array, final int elem) {
        int nOccur = 0;
        for (final int currElem : array) {
            if (currElem == elem) {
                nOccur++;
            }
        }
        return nOccur;
    }

    public static int[] evenElements(final int[] array) {
        final int length = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        int[] result = new int[length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i];
            }
        }
        return result;
    }

    public static int[] oddElements(final int[] array) {
        int[] result = new int[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[i] = array[i];
            }
        }
        return result;
    }

    public static int mostRecurringElement(final int[] array) {
        int maxOccur = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int currOccurr = countOccurrencies(array, array[i]);
            if (currOccurr > maxOccur) {
                maxOccur = currOccurr;
                result = array[i];
            }
        }
        return result;
    }

    public static int[] revertUpTo(int[] array, int stopElement) {
        int[] result = new int[array.length];
        int i = 0;
        while (i < array.length && array[i] != stopElement) {
            result[i] = array[i];
            i++;
        }
        int j = i;
        while (j < array.length) {
            result[j] = array[array.length - 1 - j + i];
            j++;
        }
        return result;
    }

    public static int[] sortArray(int[] array, boolean desc) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (desc) {
                    if (result[i] < result[j]) {
                        int tmp = result[i];
                        result[i] = result[j];
                        result[j] = tmp;
                    }
                } else {
                    if (result[i] > result[j]) {
                        int tmp = result[i];
                        result[i] = result[j];
                        result[j] = tmp;
                    }
                }
            }
        }
        return result;
    }

    public static double computeVariance(double[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double mean = total / array.length;
        double variance = 0;
        for (int i = 0; i < array.length; i++) {
            variance += Math.pow(array[i] - mean, 2);
        }
        variance /= array.length;
        return variance;
    }

    public static boolean testCountOccurrencies() {
        return countOccurrencies(new int[] { 1, 2, 3, 4 }, 1) == 1
                && countOccurrencies(new int[] { 0, 2, 3, 4 }, 1) == 0
                && countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2) == 0
                && countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1) == 3;
    }

    public static boolean testEvenElements() {
        return Arrays.equals(evenElements(new int[] { 1, 2, 3, 4 }), new int[] { 1, 3 })
                && Arrays.equals(
                        evenElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 1, 3, 5, 7, 9 })
                && Arrays.equals(
                        evenElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 4, 7, 1, 23, 73 })
                && Arrays.equals(
                        evenElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 7, 1, 12, 23, 54 });
    }

    public static boolean testOddElements() {
        return Arrays.equals(oddElements(new int[] { 1, 2, 3, 4 }),
                new int[] { 2, 4 })
                && Arrays.equals(
                        oddElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 2, 4, 6, 8 })
                && Arrays.equals(
                        oddElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 6, 9, 5, 11 })
                && Arrays.equals(
                        oddElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 5, 24, 46, 11, 81 });
    }

    public static boolean testMostRecurringElement() {
        return mostRecurringElement(new int[] { 1, 2, 1, 3, 4 }) == 1
                && mostRecurringElement(new int[] { 7, 1, 5, 7, 7, 9 }) == 7
                && mostRecurringElement(new int[] { 1, 2, 3, 1, 2, 3, 3 }) == 3
                && mostRecurringElement(new int[] { 5, 11, 2, 11, 7, 11 }) == 11;
    }

    public static void main(final String[] args) {
        System.out.println("testCountOccurrencies: " + testCountOccurrencies());
        System.out.println("testEvenElems: " + testEvenElements());
        System.out.println("testOddElems: " + testOddElements());
        System.out.println("testGetMostRecurringElem: " + testMostRecurringElement());
    }
}
