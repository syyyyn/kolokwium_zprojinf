
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import quicksort.QuickSort;

/**
 *
 * @author michalsynowiec
 */
public class TestQuickSortClass {
    
    @Test
    public void testSort()
    {
        int i = 0;
        QuickSort qs = new QuickSort();
        int[] inputArray = {9,7,5,11,12,2,14,3,10,6};
        int[] expectedArraySorted = {2,3,5,6,7,9,10,11,12,14};
        
        qs.sort(inputArray);
        
        assertArrayEquals(expectedArraySorted,inputArray);
        
        }
    
    
}
