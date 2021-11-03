package codechallenges.hashMaps;

import codechallenges.hashMap.HashMap;
import codechallenges.trees.BinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
  @Test
  void create_hash_table_test() {
    HashMap<String, String> newHashMap = new HashMap<>(30);
    assertEquals(30, newHashMap.size);
  }

  @Test
  void duplicates_test() {
    HashMap<String, String> newHashMap = new HashMap<>(30);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      newHashMap.add("Jenner", "Dulce");
      newHashMap.add("Jenner", "Dulce");
    });
  }


  @Test
  void get_test() {
    HashMap<String, String> newHashMap = new HashMap<>(30);
    newHashMap.add("Jenner", "Dulce");
    assertEquals("Dulce", newHashMap.get("Jenner"));
  }

  @Test
  void contains_test() {
    HashMap<String, String> newHashMap = new HashMap<>(30);
    newHashMap.add("Jenner", "Dulce");
    assertEquals(true, newHashMap.contains("Jenner"));
  }

  @Test
  void add_test() {
    HashMap<String, String> newHashMap = new HashMap<>(30);
  }

  @Test
  void collision_test() {
    HashMap<Integer, String> newHashMap = new HashMap<>(1);
    newHashMap.add(1, "Hi");
    newHashMap.add(2, "Crash");
    assertEquals("Hi", newHashMap.get(1));
    assertEquals("Crash", newHashMap.get(2));
  }

  @Test
  void repeatedWordTest() {
    String testString = "Once upon a time, there was a brave princess who...";
    String[] wordsArray = testString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    int size = wordsArray.length * 2;
    HashMap<String, Boolean> newHashMap = new HashMap<>(size);
    String result = newHashMap.repeatedWords(testString);
    System.out.println(result);

    String testString2 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn't know what I was doing in New York...";
    String[] wordsArray2 = testString2.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    int size2 = wordsArray2.length * 2;
    HashMap<String, Boolean> newHashMap2 = new HashMap<>(size2);
    String result2 = newHashMap2.repeatedWords(testString2);
    System.out.println(result2);

    String testString3 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    String[] wordsArray3 = testString3.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    int size3 = wordsArray3.length * 2;
    HashMap<String, Boolean> newHashMap3 = new HashMap<>(size3);
    String result3 = newHashMap3.repeatedWords(testString3);
    System.out.println(result3);
    assertEquals("a", result);
    assertEquals("summer", result2);
    assertEquals("it", result3);
  }

  @Test
  void tree_intersection_test() {
    BinarySearchTree<Integer> treeOne = new BinarySearchTree<>();
    treeOne.add(150, treeOne.root);
    treeOne.add(100, treeOne.root);
    treeOne.add(250, treeOne.root);
    treeOne.add(75, treeOne.root);
    treeOne.add(160, treeOne.root);
    treeOne.add(125, treeOne.root);
    treeOne.add(175, treeOne.root);
    treeOne.add(200, treeOne.root);
    treeOne.add(350, treeOne.root);
    treeOne.add(300, treeOne.root);
    treeOne.add(500, treeOne.root);


    BinarySearchTree<Integer> treeTwo = new BinarySearchTree<>();
    treeTwo.add(42, treeTwo.root);
    treeTwo.add(100, treeTwo.root);
    treeTwo.add(600, treeTwo.root);
    treeTwo.add(15, treeTwo.root);
    treeTwo.add(160, treeTwo.root);
    treeTwo.add(125, treeTwo.root);
    treeTwo.add(175, treeTwo.root);
    treeTwo.add(600, treeTwo.root);
    treeTwo.add(200, treeTwo.root);
    treeTwo.add(4, treeTwo.root);
    treeTwo.add(350, treeTwo.root);
    treeTwo.add(500, treeTwo.root);

    HashMap<Integer, String> newHashMap = new HashMap<>(100);
    ArrayList<Integer> result = newHashMap.treeIntersection(treeOne, treeTwo);
    ArrayList<Integer> expectedResult = new ArrayList<>();
    expectedResult.add(100);
    expectedResult.add(160);
    expectedResult.add(125);
    expectedResult.add(175);
    expectedResult.add(200);
    expectedResult.add(350);
    expectedResult.add(500);
    assertEquals(expectedResult, result);
  }

  @Test
  void tree_intersection_empty_tree_test() {
    BinarySearchTree<Integer> treeOne = new BinarySearchTree<>();

    BinarySearchTree<Integer> treeTwo = new BinarySearchTree<>();
    treeTwo.add(42, treeTwo.root);
    treeTwo.add(100, treeTwo.root);
    treeTwo.add(600, treeTwo.root);
    treeTwo.add(15, treeTwo.root);
    treeTwo.add(160, treeTwo.root);
    treeTwo.add(125, treeTwo.root);
    treeTwo.add(175, treeTwo.root);
    treeTwo.add(600, treeTwo.root);
    treeTwo.add(200, treeTwo.root);
    treeTwo.add(4, treeTwo.root);
    treeTwo.add(350, treeTwo.root);
    treeTwo.add(500, treeTwo.root);

    HashMap<Integer, String> newHashMap = new HashMap<>(100);
    int result = newHashMap.treeIntersection(treeOne, treeTwo).size();
    assertEquals(0, result);
  }

  @Test
  void tree_intersection_no_matching_test() {
    BinarySearchTree<Integer> treeOne = new BinarySearchTree<>();
    treeOne.add(150, treeOne.root);
    treeOne.add(100, treeOne.root);
    treeOne.add(15, treeOne.root);

    BinarySearchTree<Integer> treeTwo = new BinarySearchTree<>();
    treeTwo.add(42, treeTwo.root);
    treeTwo.add(600, treeTwo.root);
    treeTwo.add(160, treeTwo.root);

    HashMap<Integer, String> newHashMap = new HashMap<>(100);
    int result = newHashMap.treeIntersection(treeOne, treeTwo).size();
    assertEquals(0, result);
  }
}
