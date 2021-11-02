package codechallenges.hashMaps;

import codechallenges.hashMap.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
