package codechallenges.trees;

import codechallenges.linkedList.Node;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {


  public Node<T> add(T value, Node<T> currentNode){
    Node<T> newNode = new Node(value);
    if(this.root == null){
      this.root = newNode;
      return newNode;
    }
    if(currentNode == null){
      return newNode;
    }
    if(newNode.value.compareTo(currentNode.value) > 0){
      currentNode.right = this.add(value, currentNode.right);
    } else if(newNode.value.compareTo(currentNode.value) < 0){
      currentNode.left = this.add(value, currentNode.left);
    }
    return currentNode;
  }

  public boolean contains(T value, Node<T> currentNode){
    if(value.compareTo(currentNode.value) == 0){return true;}
    if(value.compareTo(currentNode.value) > 0){return this.contains(value, currentNode.right);}
    if(value.compareTo(currentNode.value) < 0){return this.contains(value, currentNode.left);}
    return false;
  }

  public Integer findMaxValue(Node<T> node){
    Integer largest = Integer.MIN_VALUE;
    ArrayList<Node> pseudoQueue = new ArrayList<>();
    pseudoQueue.add(node);
    while(pseudoQueue.size() > 0){
      Node<T> currentNode = pseudoQueue.remove(0);
      largest = largest.compareTo((Integer) currentNode.value) < 0  ? (Integer) currentNode.value : largest;
      if(currentNode.left != null) {pseudoQueue.add(currentNode.left);}
      if(currentNode.right != null) {pseudoQueue.add(currentNode.right);}
    }
    return largest;
  }
}
