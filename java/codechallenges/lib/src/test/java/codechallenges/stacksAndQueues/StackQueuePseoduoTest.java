package codechallenges.stacksAndQueues;


import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.linkedListsUtils.Zip;
import codechallenges.stacksAndQueues.Stack;
import codechallenges.stacksAndQueues.utils.StackQueuePseudo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StackQueuePseoduoTest {
  @Test void create_stack_queue() {
    // cannot instantiate a generic thing
    StackQueuePseudo<Integer> newQueue = new StackQueuePseudo<>();
    assertTrue(newQueue instanceof StackQueuePseudo);
  }

  @Test void added_to_stackA() throws Exception{
    // cannot instantiate a generic thing
    StackQueuePseudo<Integer> newQueue = new StackQueuePseudo<>();
    assertTrue(newQueue instanceof StackQueuePseudo);
    newQueue.enqueue(111);
    assertEquals(111, newQueue.stackA.top.value, "stackA should contain queued item");
    assertEquals(111, newQueue.stackA.peek());
  }

  @Test void add_multiple_to_stackA() throws Exception{
    // cannot instantiate a generic thing
    StackQueuePseudo<Integer> newQueue = new StackQueuePseudo<>();
    assertTrue(newQueue instanceof StackQueuePseudo);
    newQueue.enqueue(111);
    newQueue.enqueue(222);
    assertEquals(222, newQueue.stackA.top.value, "222 Should become the new top value");
    assertEquals(222, newQueue.stackA.peek());
  }

  @Test void dequeue() throws Exception{
    // cannot instantiate a generic thing
    StackQueuePseudo<Integer> newQueue = new StackQueuePseudo<>();
    assertTrue(newQueue instanceof StackQueuePseudo);
    newQueue.enqueue(111);
    newQueue.enqueue(222);
    newQueue.enqueue(333);
    newQueue.dequeue();
    assertEquals(333, newQueue.stackA.top.value, "Since 222 has been dequeued, 111 should be the new top value");
    assertEquals(222, newQueue.front.value, "Since 222 has been dequeued, 111 should be the new top value");
    assertEquals(333, newQueue.stackA.peek());
  }
}
