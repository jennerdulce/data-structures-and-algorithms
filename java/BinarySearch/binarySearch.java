package BinarySearch

public class BinarySearch {

  
  public static int binarySearch(int[] arr, int value) {
    int front = 0;
    int back = arr.length - 1;
    while (front <= back) {
      int midpoint = (front + back) / 2;
      if (value == arr[midpoint]) {
        return midpoint;
      } else if (value > arr[midpoint]) {
        front = midpoint + 1;
      } else if (value < arr[midpoint]) {
        back = midpoint - 1;
      }
    }
    return -1;
  }
}