import org.junit.Test;
public class SortTest {

    int[] array = new int[] {1, 2, 3, -5, 7, 42, 40};

    @Test
    public void shouldBeMaxValue() {
        int maxValue = Sort.getMaxValue(array);
        assert(maxValue == 42);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = Sort.getMaxValue(emptyArray);

    }
}