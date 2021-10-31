# Hash Table
<!-- Short summary or background information -->

- Binary Tree: A rooted binary tree, whose internal nodes each store a key; Each having two distinguished sub-trees (left and right)

## Challenge
<!-- Description of the challenge -->

Implement a Hashtable Class with the following methods:
- add
  - Arguments: key, value
  - Returns: nothing
  - This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get
  - Arguments: key
  - Returns: Value associated with that key in the table
  contains
  - Arguments: key
  - Returns: Boolean, indicating if the key exists in the table already.
- hash
  - Arguments: key
  - Returns: Index in the collection for that key
  -
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

### Approach

#### Hash Table

- Create a 'HashMap' class

##### add(K, V)

-

##### get(K)

-

##### contains(K)

-

## API
<!-- Description of each method publicly available to your Linked List -->

### Big O

- HashMap:
  - SPACE: O(1)
  - TIME: O(1)

### HashMap

- `.add(K Key, V value)`
  - Adds a new value to the HashMap
  - SPACE: O(1)
  - TIME: O(1)

- `.get(K key)`
  - Retrieves a value from the HashMap with the given key
  - SPACE: O(h)
  - TIME: O(n)

- `.contains(K key)`
  - Check to see if the HashMap contains a key / value pair
  - SPACE: O(1)
  - TIME: O(1)

![WHITEBOARD](./assets/Whiteboard.png)
![WHITEBOARD](./assets/findMax.png)
![WHITEBOARD](./assets/fizzBuzzKary.png)
