import static org.junit.Assert.*;

import org.junit.Test;

public class SortingNumberTest {

    @Test
    public void input1() {
        int[] inputs = { 1 };
        SortingNumber s = new SortingNumber();
        int[] sorting = s.of(inputs);
        assertArrayEquals(new int[] { 1 }, sorting);
    }
    
    @Test
    public void input2() {
        int[] inputs = { 1, 2 };
        SortingNumber s = new SortingNumber();
        int[] sorting = s.of(inputs);
        assertArrayEquals(new int[] { 1, 2 }, sorting);
    }
    
    @Test
    public void input3() {
        int[] inputs = { 2, 1 };
        SortingNumber s = new SortingNumber();
        int[] sorting = s.of(inputs);
        assertArrayEquals(new int[] { 1, 2 }, sorting);
    }
    
    @Test
    public void input4() {
        int[] inputs = { 3, 1, 2, 4 };
        SortingNumber s = new SortingNumber();
        int[] sorting = s.of(inputs);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, sorting);
    }

}
