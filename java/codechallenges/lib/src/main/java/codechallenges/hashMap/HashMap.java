package codechallenges.hashMap;


import codechallenges.linkedList.LinkedList;
import codechallenges.linkedList.Node;

import java.util.ArrayList;

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

  // Sometimes hashCode can be negative in Java, hence the abs()
  // If you really want to implement your own hashing, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character in here! Don't use Object()! Don't use any object you made that does not have hashCode() and equals() overridden
  // If you do, things that should collide, won't
  // Protip: Testing collisions is easy with Integer, because it hashes to its value
  public int hash(K key){
    return Math.abs(key.hashCode() % size);
  }
}
