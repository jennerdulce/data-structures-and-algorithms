package codechallenges.linkedList;

public class Node<T> {
  public T value;
  public Node<T> next = null;
  public Node<T> left = null;
  public Node<T> right = null;

  public Node(T value){

    this.value = value;
  }
}
