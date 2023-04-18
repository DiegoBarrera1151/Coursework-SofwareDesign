import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        String[] expected = {"Bashful", "Doc", "Dopey", "Grumpy", "Happy", "Sleepy", "Sneezy"};
        String[] input = {"Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"};

        MergeSort.mergeSort(input, 0, input.length - 1);

        assertArrayEquals(expected, input);
    }
}