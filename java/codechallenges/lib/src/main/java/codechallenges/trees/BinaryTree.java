package codechallenges.trees;

import codechallenges.linkedList.Node;
import codechallenges.stacksAndQueues.Queue;

import java.util.ArrayList;

public class BinaryTree<T> {
  Node<T> root;

  public ArrayList<T> preOrder(Node<T> node, ArrayList<T> values){
    values.add(node.value);
    if(node.left != null) {this.preOrder(node.left, values);}
    if(node.right != null) {this.preOrder(node.right, values);}
    return values;
  }

  public ArrayList<T> inOrder(Node<T> node, ArrayList<T> values){
    if(node.left != null) {this.preOrder(node.left, values);}
    values.add(node.value);
    if(node.right != null) {this.preOrder(node.right, values);}
    return values;
  }

  public ArrayList<T> postOrder(Node<T> node, ArrayList<T> values){
    if(node.left != null) {this.preOrder(node.left, values);}
    if(node.right != null) {this.preOrder(node.right, values);}
    values.add(node.value);
    return values;
  }

  public ArrayList<T> breadthFirst(){
    ArrayList<T> values = new ArrayList<>();
    ArrayList<Node> pseudoQueue = new ArrayList<>();
    pseudoQueue.add(this.root);
    while(pseudoQueue.size() > 0){
      Node<T> currentNode = pseudoQueue.remove(0);
      values.add(currentNode.value);
      if(currentNode.left != null){pseudoQueue.add(currentNode.left);}
      if(currentNode.right != null){pseudoQueue.add(currentNode.right);}
    }
    return values;
  }
}
