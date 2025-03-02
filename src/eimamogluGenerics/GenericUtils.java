package eimamogluGenerics;

/**
 * GenericUtils class that provides generic methods for arrays.
 * @author elyesaimamoglu
 * @version 2025-02-22
 */
public class GenericUtils {
    /**
     * Reverses the elements of the given array.
     * @param array the array to be reversed
     * @param <T> the type of the elements in the array
     */
    public static <T> void reverse(T[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            T temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
    /**
     * Sums the elements of the given array.
     * @param array the array to be summed
     * @param <T> the type of the elements in the array
     * @return the sum of the elements in the array
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }
}