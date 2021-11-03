package codechallenges.hashMap;


import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.Node;
import codechallenges.trees.BinarySearchTree;
import codechallenges.trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
  public ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
  public int size;

  public HashMap(int size){
    if (size < 1){
      throw new IllegalArgumentException("Hash Map must have a size of 1 or greater");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);
    for(int i = 0; i < this.size; i++){
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  public void add(K key, V value) {
    if(contains(key)){
      throw new IllegalArgumentException("No duplicates allowed");
    }

    int hash = this.hash(key);
    LinkedList<HashMapPair<K, V>> bucket  =  bucketArrayList.get(hash);
    bucket.append(new HashMapPair<>(key, value));
  }

  public V get(K key) {

    int hash = this.hash(key);
    LinkedList<HashMapPair<K, V>> currentBucket = bucketArrayList.get(hash);
    Node<HashMapPair<K, V>> currentNode = currentBucket.head;
    while (currentNode != null) {
      if (currentNode.value.getKey().equals(key)) {
        return currentNode.value.getValue();
      } else {
        currentNode = currentNode.next;
      }
    }
    return null;
  }

  public boolean contains(K key){
    int hash = this.hash(key);
    LinkedList<HashMapPair<K, V>> currentBucket = bucketArrayList.get(hash);
    Node<HashMapPair<K, V>> currentNode = currentBucket.head;
    while (currentNode != null) {
      if (currentNode.value.getKey().equals(key)) {
        return true;
      }
      else {
        currentNode = currentNode.next;
      }
    }
    return false;
  }

  public String repeatedWords(String string) {
    String[] wordsArray = string.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    for (String word : wordsArray) {
      if (this.contains((K) word)) {
        return word;
      }
      this.add((K) word.toLowerCase(), (V) "test");
    }
    return null;
  }

  public ArrayList<Integer> treeIntersection(BinarySearchTree<Integer> treeOne, BinarySearchTree<Integer> treeTwo) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Node<Integer> treeOneRoot = treeOne.root;
    Node<Integer> treeTwoRoot = treeTwo.root;
    _walk(treeOneRoot, numbers);
    _walk(treeTwoRoot, numbers);
    return numbers;
  }

  public void _walk(Node<Integer> node, List<Integer> numbers){
    if(this.contains((K) node.value)){
      numbers.add(node.value);
    } else {
      this.add((K) node.value, (V) "hi");
    }
    if(node.left != null) {this._walk(node.left, numbers);}
    if(node.right != null) {this._walk(node.right, numbers);}
  }

  // Sometimes hashCode can be negative in Java, hence the abs()
  // If you really want to implement your own hashing, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character in here! Don't use Object()! Don't use any object you made that does not have hashCode() and equals() overridden
  // If you do, things that should collide, won't
  // Protip: Testing collisions is easy with Integer, because it hashes to its value
  public int hash(K key){
    return Math.abs(key.hashCode() % size);
  }
}
