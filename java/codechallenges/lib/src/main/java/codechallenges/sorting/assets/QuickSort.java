package codechallenges.sorting.assets;

public class QuickSort {
  public static int[] quickSort(int[] arr, int left, int right){
    int position;
    if (arr.length > 1){
      position = partition(arr, left, right);
      if(left < position - 1){
        quickSort(arr, left, position -1);
      }

      if(position < right){
        quickSort(arr, position, right);
      }
    }
    return arr;
  }

  public static int partition(int[] arr, int left, int right){
    int pivot = (right + left) / 2;
    int i = left;
    int j = right;
    while (i <= j){
      while (arr[i] < arr[pivot]){
        i++;
      }
      while (arr[j] > arr[pivot]){
        j--;
      }
      if (i <= j){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return i;
  }

  public static void swap(int[] arr, int left, int right){
    int temp;
    temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
  }
}
