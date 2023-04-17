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
    // end mergeSort part
    }

    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from;       // size of the list to be merged
        String[] b = new String[n];   // merge both halves into a temporary b
        int i1 = from;               // next element in the first list
        int i2 = mid;            // next element in the second list
        int j = 0;                   // next open position in b

        // moving the smaller i1 i2 into b
        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            }
            else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }


    
}