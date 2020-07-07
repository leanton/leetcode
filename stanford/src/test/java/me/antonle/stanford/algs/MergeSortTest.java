package me.antonle.stanford.algs;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void should_sort_the_array() {
        // given
        int[] input = new int[]{4, 5, 7, 6, 3, 1, 2, 8, 8, 6};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 8};

        final int[] actual = MergeSort.mergeSort(input);
        Assert.assertArrayEquals(expected, actual);
    }
}