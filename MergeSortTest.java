import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void testSort() {
        List<String> dwarfs = new ArrayList<>(Arrays.asList("Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"));
        List<String> expected = new ArrayList<>(Arrays.asList("Bashful", "Doc", "Dopey", "Grumpy", "Happy", "Sleepy", "Sneezy"));
        List<String> actual = MergeSort.sort(dwarfs);
        assertEquals(expected, actual);
    }
}