package learning.sorting.impl;

import com.codekedos.learning.sorting.impl.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testValidSort() {
        BubbleSort sorter = new BubbleSort();
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};

        sorter.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_withDuplicateValues() {
        BubbleSort sorter = new BubbleSort();
        int[] input = {3, 3, 2, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Duplicates should be sorted correctly.");
    }

    @Test
    void testSort_withNegativeNumbers() {
        BubbleSort sorter = new BubbleSort();
        int[] input = {-3, -1, -7, -2};
        int[] expected = {-7, -3, -2, -1};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Negative numbers should be sorted properly.");
    }

    @Test
    void testSort_throwsExceptionWhenArrayTooSmall() {
        BubbleSort sorter = new BubbleSort();
        int[] input = {10};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> sorter.sort(input));
        assertEquals("Array must have at least 2 elements to sort.", exception.getMessage());
    }

    @Test
    void testSort_throwsExceptionWhenArrayIsNull() {
        BubbleSort sorter = new BubbleSort();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sorter.sort(null));
        assertEquals("Array must have at least 2 elements to sort.", exception.getMessage());
    }

}
