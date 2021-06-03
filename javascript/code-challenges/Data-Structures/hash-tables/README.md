# Hash Table
<!-- Short summary or background information -->
- The basic idea of a hashtable is the ability to store the key into this data structure, and quickly retrieve the value. This is done through what we call a hash. A hash is the ability to encode the key that will eventually map to a specific location in the data structure that we can look at directly to retrieve the value.

## Challenge
<!-- Description of the challenge -->
- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

### Tests

Write tests to prove the following functionality:

- Adding a key/value to your hashtable results in the value being in the data structure
- Retrieving based on a key returns the value stored
- Successfully returns null for a key that does not exist in the hashtable
- Successfully handle a collision within the hashtable
- Successfully retrieve a value from a bucket within the hashtable that has a collision
- Successfully hash a key to an in-range value

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach

#### Node

- Create a node class
- create the following properties as part of the constructor: value, next

#### LinkedList

- create a linkedlist class
- create a head property as part of the constructor

##### append(value)

- start from the beginning node
- create a while loop to loop through nodes
  - check to see if LL is empty
    - if empty set head to newly created node
  - if not empty
    - create a while loop to loop through nodes
    - if the current value equals value we are looking for
      - set `next` property of newly created node to `next` property if current node
      - return `this`
    - otherwise, move on to the next node and repeat
  - return null if value is not in linked list

##### print()

- Traverse through Linked List while adding the value to a string separated by a `=>`.

#### Hash Table

- Create a HashMap class
- Create a size property that takes in a parameter
  - Create a map property that creates a new array with the size property

##### hash(key)

- Split the arguement (string)
- Convert each individual letter into a charCode
- Add each letter to a total
- Multiply this total by a prime number and modulo by the size of the Linked List

##### set(key, value)

- Start by hasing the key
- Check to see if there is an already created Linked List on the hashed index
- Create an entry using the key and value pair
- Append the new entry to the Linked List at the hash

##### get(key)

- Start by hashing the key
- Check to see if there is a linked list at the hash
- Traverse the Linked list to see if key is within the linked list
  - return the node if it is
  - else return null

##### has(key)
  
- Start by hashing the key
- Check to see if there is a linked list at the hash
- Traverse the Linked list to see if key is within the linked list
  - return true if it is
  - else return null

  
#### API
<!-- Description of each method publicly available to your Linked List -->

##### Linked List

- `.append(value)`
  - Add a new node to the end of the linked list

- `.print()`
  - Prints all the values of a Linked List within a single string

##### Hash Table

- `.hash(key)`
  - Convert a string into, an index for the Hash Table

- `.set(key, value)`
  - Creates a new entry for the Hash Table

- `.get(key)`
  - Return the data if the key is within the Hash Table

- `.has(key)`
  - Return a boolean if the key is within the Hash Table

#### Big O

##### Linked List

- append(value):
  - SPACE: O(1)
  - TIME: O(n)

- print():
  - SPACE: O(n)
  - TIME: O(n)

##### Hash Table

- hash(key):
  - SPACE: O(1)
  - TIME: O(1)

- set(key, value):
  - SPACE: O(1)
  - TIME: O(1)

- get(key):
  - SPACE: O(1)
  - TIME: O(1)

- has(key):
  - SPACE: O(1)
  - TIME: O(1)
