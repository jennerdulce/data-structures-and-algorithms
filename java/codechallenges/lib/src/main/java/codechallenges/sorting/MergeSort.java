package codechallenges.sorting;

import java.util.Arrays;

public class MergeSort {
  public static int[] mergeSort(int[] arr){
    int n = arr.length;
    if(n > 1){
      int mid = n/2;
      int[] left = Arrays.copyOfRange(arr, 0, mid);
      int[] right = Arrays.copyOfRange(arr, mid, arr.length);
      mergeSort(left);
      mergeSort(right);
      return merge(left, right, arr);
    }
    return arr;
  }

  public static int[] merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length){
      if(left[i] <= right[j]){
        arr[k] = left[i];
        i =  i + 1;
      } else {
        arr[k] = right[j];
        j = j + 1;
      }
      k = k + 1;
    }
    if (i == left.length){
      while(j < right.length){
        arr[k] = right[j];
        k = k + 1;
        j = j + 1;
      }
    } else {
      while(i < left.length){
        arr[k] = left[i];
        k = k + 1;
        i = i + 1;
      }
    }
    return arr;
  }
}
