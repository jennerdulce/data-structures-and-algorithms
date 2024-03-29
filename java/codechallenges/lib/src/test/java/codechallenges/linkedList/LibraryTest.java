/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codechallenges.linkedList;

import codechallenges.linkedList.linkedListsUtils.Zip;
import codechallenges.stacksAndQueues.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void creates_new_linkedlist() {
      // cannot instantiate a generic thing
      LinkedList<Integer> newLL = new LinkedList<>();
      assertEquals(true, newLL instanceof LinkedList, "Should create a new Linked List");
    }

  @Test void add_new_node() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(999);
    assertTrue(newLL.head.value == 999, "Should create tie in first insert to the head of the linked list");
    assertEquals(999, newLL.head.value, "Should create tie in first insert to the head of the linked list");
  }

  @Test void add_second_new_node() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(999);
    newLL.append(111);
    assertTrue(newLL.head.value == 999, "Should add the second node to the head");
    assertEquals(111, newLL.head.next.value, "Should add the second node to the head");
  }

  @Test void includes_value() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(999);
    newLL.append(111);
    newLL.append(777);
    boolean isTrue = newLL.includes(111);
    boolean isFalse = newLL.includes(8);
    assertEquals(true, isTrue, "Should return true because value is in the linked list");
    assertEquals(false, isFalse, "Should return false because value is NOT in the linked list");
  }

  @Test void insert_front() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(1);
    newLL.append(2);
    newLL.insertFront(999);
    String expectedResult = "{ 999 } -> { 1 } -> { 2 } -> NULL";
    String actualResult = newLL.toString();
    assertEquals(expectedResult, actualResult, "Should insert new node to the front");
  }

  @Test void insert_before_value() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(1);
    newLL.append(2);
    newLL.append(3);
    newLL.insertBefore(2, 999);
    String expectedResult = "{ 1 } -> { 999 } -> { 2 } -> { 3 } -> NULL";
    String actualResult = newLL.toString();
    assertEquals(expectedResult, actualResult, "Should add the  new node before the given value");
  }

  @Test void insert_after_value() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(1);
    newLL.append(2);
    newLL.append(3);
    newLL.insertAfter(2, 999);
    String expectedResult = "{ 1 } -> { 2 } -> { 999 } -> { 3 } -> NULL";
    String actualResult = newLL.toString();
    assertEquals(expectedResult, actualResult, "Should add the new node after the given value");
  }

  @Test void delete_node() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(1);
    newLL.append(2);
    newLL.append(3);
    newLL.delete(2);
    String expectedResult = "{ 1 } -> { 3 } -> NULL";
    String actualResult = newLL.toString();
    assertEquals(expectedResult, actualResult, "Should delete the node with the given value");
  }

  @Test void kth_from_the_end() {
    LinkedList<Integer> newLL = new LinkedList<>();
    newLL.append(1);
    newLL.append(2);
    newLL.append(3);
    String expectedResult = "2";
    String actualResult = newLL.kthFromEnd(1);
    assertEquals(expectedResult, actualResult, "Should return the value of the node kth from the end (starting at 0)");
  }

  @Test void zip_two_linked_lists() {
      // How to go about creating a function
    LinkedList<Integer> firstLL = new LinkedList<>();
    firstLL.append(1);
    firstLL.append(2);
    firstLL.append(3);
    LinkedList<Integer> secondLL = new LinkedList<>();
    secondLL.append(111);
    secondLL.append(222);
    secondLL.append(333);
    System.out.println(firstLL.toString());
    System.out.println(secondLL.toString());
    System.out.println(Zip.zip(firstLL, secondLL).toString());
    assertEquals("{ 1 } -> { 111 } -> { 2 } -> { 222 } -> { 3 } -> { 333 } -> NULL", Zip.zip(firstLL, secondLL).toString());
  }

  @Test void zip_two_linked_lists_a_longer() {
    // How to go about creating a function
    LinkedList<Integer> firstLL = new LinkedList<>();
    firstLL.append(1);
    firstLL.append(2);
    firstLL.append(3);
    firstLL.append(4);
    firstLL.append(5);
    LinkedList<Integer> secondLL = new LinkedList<>();
    secondLL.append(111);
    secondLL.append(222);
    secondLL.append(333);
    System.out.println(firstLL.toString());
    System.out.println(secondLL.toString());
    System.out.println(Zip.zip(firstLL, secondLL).toString());
    assertEquals("{ 1 } -> { 111 } -> { 2 } -> { 222 } -> { 3 } -> { 333 } -> { 4 } -> { 5 } -> NULL", Zip.zip(firstLL, secondLL).toString());
  }

  @Test void zip_two_linked_lists_n_longer() {
    // How to go about creating a function
    LinkedList<Integer> firstLL = new LinkedList<>();
    firstLL.append(1);
    firstLL.append(2);
    firstLL.append(3);
    LinkedList<Integer> secondLL = new LinkedList<>();
    secondLL.append(111);
    secondLL.append(222);
    secondLL.append(333);
    secondLL.append(444);
    secondLL.append(555);
    System.out.println(firstLL.toString());
    System.out.println(secondLL.toString());
    System.out.println(Zip.zip(firstLL, secondLL).toString());
    assertEquals("{ 1 } -> { 111 } -> { 2 } -> { 222 } -> { 3 } -> { 333 } -> { 444 } -> { 555 } -> NULL", Zip.zip(firstLL, secondLL).toString());
  }

  @Test void zip_one_empty_list() {
    // How to go about creating a function
    LinkedList<Integer> firstLL = new LinkedList<>();
    LinkedList<Integer> secondLL = new LinkedList<>();
    secondLL.append(111);
    secondLL.append(222);
    secondLL.append(333);
    secondLL.append(444);
    secondLL.append(555);
    System.out.println(secondLL.toString());
    System.out.println(Zip.zip(firstLL, secondLL).toString());
    assertEquals("{ 111 } -> { 222 } -> { 333 } -> { 444 } -> { 555 } -> NULL", Zip.zip(firstLL, secondLL).toString());
  }

  @Test void zip_both_lists_empty() {
    // How to go about creating a function
    LinkedList<Integer> firstLL = new LinkedList<>();
    LinkedList<Integer> secondLL = new LinkedList<>();
    System.out.println(Zip.zip(firstLL, secondLL).toString());
    assertEquals("NULL", Zip.zip(firstLL, secondLL).toString());
  }
}
