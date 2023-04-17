import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        String[] values = {"hello", "zoo", "airplain", "bakery", "clean", "daisy","oliver","bear"};
        mergeSort(values, 0, values.length - 1);
        System.out.println("Result " + Arrays.toString(values));
    }

    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first and the second half equally
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }// end mergeSort part



    
}