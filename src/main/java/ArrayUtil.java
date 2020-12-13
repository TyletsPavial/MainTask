import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static <T extends Comparable> void bubbleSort(T[] array) {
        boolean flag = true;
        T obj;
        int length = array.length;
        do{
            flag = true;
            for(int i = 1; i < length; i++){
                if(array[i - 1].compareTo(array[i]) > 0){
                    flag = false;
                    obj = array[i - 1];
                    array[i -1] =  array[i];
                    array[i] =  obj;
                }
            }

        }while(!flag);

    }

    public static <T extends Comparable> void quickSort(T[] array){
        quickSort(array, array.length, 0);


    }
    private static <T extends Comparable> void quickSort(T[] array, int length, int start) {
        int supElementIndex = (length / 2) + start;
        T buffer;
        int i = start;
        boolean flag = true;
        while (i < start + length) {
            if (i < supElementIndex && array[i].compareTo(array[supElementIndex]) >= 0) {
                buffer = array[i];
                for (int j = i + 1; j <= supElementIndex; j++) {
                    array[j - 1] = array[j];
                }
                array[supElementIndex] = buffer;
                supElementIndex -= 1;
                flag = false;
            } else if (i < supElementIndex && array[i].compareTo(array[supElementIndex]) < 0) {
                i++;
            } else if (i > supElementIndex && array[i].compareTo(array[supElementIndex]) < 0) {
                buffer = array[i];
                for (int j = i; j > supElementIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[supElementIndex] = buffer;
                supElementIndex += 1;
                i++;
                flag = false;
            } else if (i > supElementIndex && array[i].compareTo(array[supElementIndex]) >= 0) {
                i++;
            }
            if (i == supElementIndex) {
                i ++;
            }
        }
        if (!flag) {
            quickSort(array,supElementIndex - start + 1, start);
            quickSort(array, length - supElementIndex + start, supElementIndex);
        }
    }

    public static <T extends Object> int linearSearch(T[] array, T element){
        int length = array.length;
        for(int i = 0; i < length; i++){
            if(array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable> int binarySearch(T[] array, T element) {
        int upperBorder = array.length;
        int bottomBorder = 0;
        int result;

        while(upperBorder - bottomBorder > 1){
            result = (upperBorder + bottomBorder) / 2;
            if(array[result].equals(element)){
                return result;
            }
            else if(array[result].compareTo(element) > 0){
                upperBorder = result;
            }
            else {
                bottomBorder = result;
            }
        }

        return -1;
    }
}
