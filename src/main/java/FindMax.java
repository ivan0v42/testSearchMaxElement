public class FindMax
{
    public static int getMaxValue(int[] array) {
        int value = Integer.MIN_VALUE;

        if (array.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }
}
