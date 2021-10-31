package codechallenges.sortingMethods;

import codechallenges.sorting.mergeSort.MergeSort;
import codechallenges.sorting.insertionSort.SortingMethods;
import codechallenges.sorting.quickSort.QuickSort;
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

  @Test void insertion_empty_test() {
    // Expected Failure
    //  assertArrayEquals(expected, sortedArr);
  }

  @Test void insertion_sort_duplicates_test() {
    // Edge Case Duplicates
    SortingMethods insertionSort = new SortingMethods();
    int[] numArr = {1, 1, 1};
    int[] sortedArr = insertionSort.insertSort(numArr);
    int[] expected = {1, 1, 1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void insertion_sort_single_value_test() {
    // Edge Case Single Value
    SortingMethods insertionSort = new SortingMethods();
    int[] numArr = {1};
    int[] sortedArr = insertionSort.insertSort(numArr);
    int[] expected = {1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void insertion_sort_negative_number_test() {
    // Edge Case Negative Numbers
    SortingMethods insertionSort = new SortingMethods();
    int[] numArr = {1, 8, -9, 100, -50};
    int[] sortedArr = insertionSort.insertSort(numArr);
    int[] expected = {-50, -9, 1, 8, 100};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_test() {
    // Happy Path
    MergeSort sort = new MergeSort();
    int[] numArr = {8, 4, 23, 42, 16, 15};
    int[] sortedArr = sort.mergeSort(numArr);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_empty_test() {
    // Expected Failure
    //  assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_duplicates_test() {
    // Edge Case Duplicates
    MergeSort sort = new MergeSort();
    int[] numArr = {1, 1, 1};
    int[] sortedArr = sort.mergeSort(numArr);
    int[] expected = {1, 1, 1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_single_value_test() {
    // Edge Case Single Value
    MergeSort sort = new MergeSort();
    int[] numArr = {1};
    int[] sortedArr = sort.mergeSort(numArr);
    int[] expected = {1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void merge_sort_negative_number_test() {
    // Edge Case Negative Numbers
    MergeSort sort = new MergeSort();
    int[] numArr = {1, 8, -9, 100, -50};
    int[] sortedArr = sort.mergeSort(numArr);
    int[] expected = {-50, -9, 1, 8, 100};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_test() {
    QuickSort sort = new QuickSort();
    int[] numArr = {8, 4, 23, 42, 16, 15};
    int[] sortedArr = sort.quickSort(numArr, 0, numArr.length -1);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_empty_test() {
    // Expected Failure
    //  assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_duplicates_test() {
    // Edge Case Duplicates
    QuickSort sort = new QuickSort();
    int[] numArr = {1, 1, 1};
    int[] sortedArr = sort.quickSort(numArr, 0, numArr.length -1);
    int[] expected = {1, 1, 1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_single_value_test() {
    // Edge Case Single Value
    QuickSort sort = new QuickSort();
    int[] numArr = {1};
    int[] sortedArr = sort.quickSort(numArr, 0, numArr.length -1);
    int[] expected = {1};
    assertArrayEquals(expected, sortedArr);
  }

  @Test void quick_sort_negative_number_test() {
    // Edge Case Negative Numbers
    QuickSort sort = new QuickSort();
    int[] numArr = {1, 8, -9, 100, -50};
    int[] sortedArr = sort.quickSort(numArr, 0, numArr.length -1);
    int[] expected = {-50, -9, 1, 8, 100};
    assertArrayEquals(expected, sortedArr);
  }
}
