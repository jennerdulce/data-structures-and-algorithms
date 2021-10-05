package codechallenges.linkedList.linkedListsUtils;

import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.Node;

public class Zip {
  // static means that you dont have to instantiate
  public static <T> LinkedList<T> zip(LinkedList<T> listA, LinkedList<T> listB) {
    LinkedList<T> newList = new LinkedList();
    Node<T> currentA = listA.head;
    Node<T> currentB = listB.head;
    if (currentA == null && currentB == null) {
      // Do nothing
    } else {
      while (currentA != null && currentB != null) {
        newList.append(currentA.value);
        newList.append(currentB.value);
        currentA = currentA.next;
        currentB = currentB.next;
      }
      while (currentA != null) {
        newList.append(currentA.value);
        currentA = currentA.next;
      }
      while (currentB != null) {
        newList.append(currentB.value);
        currentB = currentB.next;
      }
    }
    return newList;
  }
}
