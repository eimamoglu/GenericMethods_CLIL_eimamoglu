package eimamogluGenerics;
import java.util.Arrays;

/**
 * GenericUtilsTest is a test class for GenericUtils class.
 * @author elyesaimamoglu
 * @version  2025-02-22
 */
public class GenericUtilsTest {
    public static void main(String[] args) {
        System.out.println("--Testing GenericUtils methods--");
        // Test reverse method
        System.out.println("Reverse method:");

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Integer Array: " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        GenericUtils.reverse(strArray);
        System.out.println("Reversed String Array: " + Arrays.toString(strArray));

        // Test sum method
        System.out.println("Sum method:");

        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Original Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));

        Integer[] numArray = {10, 20, 30, 40};
        System.out.println("Original Integer Array: " + Arrays.toString(numArray));
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(numArray));

    }
}