import java.util.Arrays;

public class Quicksort {
    public static long quickSort(double[] testArray) {
        long start = System.currentTimeMillis();
        double []arr = Arrays.copyOfRange(testArray,0,testArray.length - - 1);
        sort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        long diff = end - start;
        return diff;
    }
    private static void sort(double[] arr, int low, int high) {
        int i = low;
        int j = high;
        double middle = arr[(low + high) / 2];
        while(i <= j) {
            while(arr[i] < middle ) {
                i++;
            }
            while(arr[j] > middle) {
                j--;
            }
            if( i <= j) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        if(low < j) {
            sort(arr, low, j);
        }

        if(i < high) {
            sort(arr, i, high);
        }
    }
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}