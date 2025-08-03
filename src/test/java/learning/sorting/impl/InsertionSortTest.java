package learning.sorting.impl;

import com.codekedos.learning.sorting.impl.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InsertionSortTest {

    @Test
    public void testValidSort() {
        InsertionSort sorter = new InsertionSort();
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};

        sorter.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_withDuplicateValues() {
        InsertionSort sorter = new InsertionSort();
        int[] input = {3, 3, 2, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Duplicates should be sorted correctly.");
    }

    @Test
    void testSort_withNegativeNumbers() {
        InsertionSort sorter = new InsertionSort();
        int[] input = {-3, -1, -7, -2};
        int[] expected = {-7, -3, -2, -1};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Negative numbers should be sorted properly.");
    }

    @Test
    void testSort_WhenArrayTooSmall() {
        InsertionSort sorter = new InsertionSort();
        int[] input = {10};
        int[] expected = {10};
        sorter.sort(input);
        assertArrayEquals(expected, input, "have only 1 element.");
    }

    @Test
    void testSort_throwsExceptionWhenArrayIsNull() {
        InsertionSort sorter = new InsertionSort();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sorter.sort(null));
        assertEquals("Array is null or empty.", exception.getMessage());
    }
}
