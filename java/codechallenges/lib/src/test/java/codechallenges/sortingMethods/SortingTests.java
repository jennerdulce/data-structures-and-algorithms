package codechallenges.sortingMethods;

import codechallenges.sorting.MergeSort;
import codechallenges.sorting.SortingMethods;
import codechallenges.sorting.assets.QuickSort;
import codechallenges.stacksAndQueues.utils.multiBracket.MultiBracket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTests {
  @Test void insertion_sort_test() {
    SortingMethods insertionSort = new SortingMethods();
    int[] numArr = {8, 4, 23, 42, 16, 15};
    int[] sortedArr = insertionSort.insertSort(numArr);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_test() {
    MergeSort sort = new MergeSort();
    int[] numArr = {8, 4, 23, 42, 16, 15};
    int[] sortedArr = sort.mergeSort(numArr);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_test() {
    QuickSort sort = new QuickSort();
    int[] numArr = {8, 4, 23, 42, 16, 15};
    int[] sortedArr = sort.quickSort(numArr, 0, numArr.length -1);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sortedArr);
  }
}
