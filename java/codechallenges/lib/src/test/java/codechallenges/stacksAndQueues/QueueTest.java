package codechallenges.stacksAndQueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  @Test void enqueue(){
    Queue<Integer> newQueue = new Queue<>();
    newQueue.enqueue(1);
    assertEquals(1, newQueue.front.value, "Front value should equal 1");
  }

  @Test void enqueue_multiple_queue(){
    Queue<Integer> newQueue = new Queue<>();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    assertEquals(1, newQueue.front.value, "Front value should equal 1");
  }

  @Test void dequeue() throws Exception{
    Queue<Integer> newQueue = new Queue<>();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.dequeue();
    assertEquals(2, newQueue.front.value, "Front value should be replaced by the next item in the queue (2)");
  }

  @Test void peek_queue() throws Exception{
    Queue<Integer> newQueue = new Queue<>();
    newQueue.enqueue(1);
    assertEquals(1, newQueue.peek(), "Peek should return the front value");
  }

  @Test void multiple_dequeue() throws Exception{
    Queue<Integer> newQueue = new Queue<>();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.dequeue();
    newQueue.dequeue();
    assertEquals(null, newQueue.front, "Should return null after all nodes have been removed");
  }

  @Test void create_new_queue() throws Exception{
    Queue<Integer> newQueue = new Queue<>();
    assertTrue(newQueue instanceof Queue);
  }

  @Test void queue_exceptions() throws Exception{
    Queue<Integer> newQueue = new Queue<>();
    assertThrows(Exception.class, () -> newQueue.peek());
    assertThrows(Exception.class, () -> newQueue.dequeue());
  }
}
