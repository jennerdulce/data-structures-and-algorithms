package ArrayReverse;

public class arrayReverse{

  public static int[] returnArr(int[] arr){
  int front = 0;
  int back = arr.length - 1;
  int temp = 0;
  while(front <= back){
  temp = arr[back];
  arr[back] = arr[front];
  arr[front] = temp;
  front++;
  back--;
  }
  return arr;
  }
}