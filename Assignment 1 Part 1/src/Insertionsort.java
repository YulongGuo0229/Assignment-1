import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertionsort {
    public static long insertionSort(double [] testArray){
        long start = System.currentTimeMillis();
        double []arr = Arrays.copyOfRange(testArray,0,testArray.length - - 1);
        for (int i = 1;i < arr.length; i++){
            double temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
        long end = System.currentTimeMillis();
        long diff = end - start;
        return diff;
    }
}
