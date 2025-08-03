package learning.sorting.impl;

import com.codekedos.learning.sorting.impl.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SelectionSortTest {
    @Test
    public void testValidSort() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};

        sorter.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testSort_withDuplicateValues() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {3, 3, 2, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Duplicates should be sorted correctly.");
    }

    @Test
    void testSort_withNegativeNumbers() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {-3, -1, -7, -2};
        int[] expected = {-7, -3, -2, -1};

        sorter.sort(input);

        assertArrayEquals(expected, input, "Negative numbers should be sorted properly.");
    }

    @Test
    void testSort_WhenArrayTooSmall() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {10};
        int[] expected = {10};
        sorter.sort(input);
        assertArrayEquals(expected, input, "have only 1 element.");
    }

    @Test
    void testSort_throwsExceptionWhenArrayIsNull() {
        SelectionSort sorter = new SelectionSort();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sorter.sort(null));
        assertEquals("Array is null or empty.", exception.getMessage());
    }
}
