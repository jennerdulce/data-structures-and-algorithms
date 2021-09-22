package ArrayInsertShift;

public class arrayInsertShift {
  public static int[] insertShiftArray(int[] arr, int value){
    int midpoint = arr.length / 2;
    boolean numberAdded = false;
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < arr.length + 1; i++) {
      if (i == midpoint) {
        newArr[i] = value;
        numberAdded = true;
      } else {
        if (numberAdded) {
          newArr[i - 1] = arr[i];
        } else {
          newArr[i] = arr[i];
        }
      }
    }
    return arr;
  }
}
