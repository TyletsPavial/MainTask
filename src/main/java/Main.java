import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Integer[] arrayToQuickSort = new Integer[]{1, 5, 7, 11, 4, 3, 2, 8, 10};
        Integer[] arrayToBubbleSort = new Integer[]{1, 5, 7, 8, 4, 3};

        TreePrinterUtil.print();

        System.out.print("Enter Number: ");
        int testInt = reader.nextInt();
        int testBinaryInt = NumberUtil.convertDecimalToBinary(testInt);

        System.out.println("Is number simple: " + NumberUtil.isSimple(testInt));
        System.out.println("The " + testInt + "'th Fibonachi's number: " + NumberUtil.findFibonachi(testInt));
        try {
            System.out.println(testInt + "!: " + NumberUtil.calcFactorial(testInt));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(testInt + " in binary view: " + testBinaryInt);
        System.out.println("Back to decimal: " + NumberUtil.convertBinaryToDecimal(testBinaryInt));


        System.out.println("Bubble sort:");
        System.out.println("Original array: " + Arrays.toString(arrayToBubbleSort));
        ArrayUtil.quickSort(arrayToBubbleSort);
        System.out.println("Array after sorting: " + Arrays.toString(arrayToBubbleSort));


        System.out.println("Quick sort:");
        System.out.println("Original array: " + Arrays.toString(arrayToQuickSort));
        ArrayUtil.quickSort(arrayToQuickSort);
        System.out.println("Array after sorting: " + Arrays.toString(arrayToQuickSort));
    }
}
