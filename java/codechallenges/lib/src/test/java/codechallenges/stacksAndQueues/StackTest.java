package codechallenges.stacksAndQueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  @Test void push_on_to_stack(){
    Stack<Integer> newStack = new Stack<>();
    newStack.push(999);
    assertEquals(999, newStack.top.value, "The top value should be 999");
  }


  @Test void push_multiple_stack(){
    Stack<Integer> newStack = new Stack<>();
    newStack.push(999);
    newStack.push(111);
    assertEquals(111, newStack.top.value, "The top value should be 111");
  }

  @Test void pop_off_stack() throws Exception{
    Stack<Integer> newStack = new Stack<>();
    newStack.push(999);
    newStack.push(111);
    int actualResult = newStack.pop();
    assertEquals(111, actualResult, "The popped value should be 111");
    assertEquals(999, newStack.top.value, "The new top value should be replaced with 999");
  }

  @Test void empty_stack() throws Exception{
    Stack<Integer> newStack = new Stack<>();
    newStack.push(999);
    newStack.push(111);
    newStack.pop();
    newStack.pop();
    assertEquals(null, newStack.top, "The value of top should be null");
  }

  @Test void peek_stack() throws Exception{
    Stack<Integer> newStack = new Stack<>();
    newStack.push(999);
    int actualResult = newStack.peek();
    assertEquals(999, actualResult, "The peeked value should be 999");
  }

  @Test void create_new_stack(){
    Stack<Integer> newStack = new Stack<>();
    assertTrue(newStack instanceof Stack);
  }

  @Test void stack_exceptions() throws Exception{
    Stack<Integer> newStack = new Stack<>();
    assertThrows(Exception.class, () -> newStack.peek());
    assertThrows(Exception.class, () -> newStack.pop());
  }
}
