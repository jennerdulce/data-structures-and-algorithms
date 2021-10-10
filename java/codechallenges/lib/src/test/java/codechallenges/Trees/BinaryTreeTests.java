package codechallenges.Trees;

import codechallenges.trees.BinarySearchTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTests {
  @Test
  void create_new_tree(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    assertEquals(true, newTree instanceof BinarySearchTree);
  }
}
