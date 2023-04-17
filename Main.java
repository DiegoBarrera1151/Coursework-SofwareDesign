import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        String[] values = {"foo", "bar", "alice", "bob", "celine", "david"};
        mergeSort(values, 0, values.length - 1);
        System.out.println("Result " + Arrays.toString(values));
    }



    
}