package test;

import org.junit.Test;

import static org.junit.Assert.*;

import main.BonusBinarySearch;

public class BonusBinarySearchTest {
    public BonusBinarySearch test_Class =  new BonusBinarySearch();
    public int[] sortedNumbers = {1, 2, 4, 5, 8, 9, 15, 25, 30};


    @Test
    public void returnsIfInTheStartOfArray() {
        assertEquals(1, BonusBinarySearch.binarySearch(sortedNumbers, 1));
    }
}
