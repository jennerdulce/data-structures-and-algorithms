package codechallenges.Trees;

import codechallenges.trees.BinarySearchTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTests {
  @Test
  void create_new_tree_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    assertEquals(true, newTree instanceof BinarySearchTree);
  }

  @Test
  void add_root_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    assertEquals(8, newTree.root.value);
  }

  @Test
  void add_left_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    assertEquals(3, newTree.root.left.value);
  }

  @Test
  void add_right_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(30, newTree.root);
    assertEquals(30, newTree.root.right.value);
  }

  @Test
  void contains_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    assertEquals(true, newTree.contains(1, newTree.root));
  }

  @Test
  void in_order_traversal_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(1); expectedResult.add(3); expectedResult.add(5); expectedResult.add(8); expectedResult.add(30); expectedResult.add(44);
    assertEquals(expectedResult, newTree.inOrder(newTree.root, values));
  }

  @Test
  void post_order_traversal_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(1); expectedResult.add(5); expectedResult.add(3); expectedResult.add(44); expectedResult.add(30); expectedResult.add(8);
    assertEquals(expectedResult, newTree.postOrder(newTree.root, values));
  }

  @Test
  void pre_order_traversal_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(8); expectedResult.add(3); expectedResult.add(1); expectedResult.add(5); expectedResult.add(30); expectedResult.add(44);
    assertEquals(expectedResult, newTree.preOrder(newTree.root, values));
  }

  @Test
  void breadth_first_traversal_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(8); expectedResult.add(3); expectedResult.add(30); expectedResult.add(1); expectedResult.add(5); expectedResult.add(44);
    assertEquals(expectedResult, newTree.breadthFirst());
  }
}
