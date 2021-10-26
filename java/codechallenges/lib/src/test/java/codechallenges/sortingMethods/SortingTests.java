package codechallenges.sortingMethods;

import codechallenges.sorting.SortingMethods;
import codechallenges.stacksAndQueues.utils.multiBracket.MultiBracket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTests {
  @Test void insertion_sort_test() {
    SortingMethods insertionSort = new SortingMethods();
    int[] numArr = {2, 5, 3, 1};
    int[] sortedArr = insertionSort.insertSort(numArr);
    for(int num : sortedArr){
      System.out.println(num);
    }
    System.out.println(sortedArr);
    assertEquals(4, sortedArr.length);
  }
}
