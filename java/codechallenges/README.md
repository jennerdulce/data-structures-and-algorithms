# Singly Linked List
<!-- Short summary or background information -->
- *"A Linked List is a sequence of Nodes that are connected/linked to each other. The most defining feature of a Linked List is that each Node references the next Node in the link.*"
- [Linked List](https://github.com/jennerdulce/reading-notes/blob/main/Java-401-05.md)

## Challenge
<!-- Description of the challenge -->
- The class should contain the following methods

### Create a Linked List class

- Within your Linked List class, include a head property.
- Upon instantiation, an empty Linked List should be created.

### insert

- Arguments: value
- Returns: nothing
- Adds a new node with that value to the head of the list with an O(1) Time performance.

### includes

- Arguments: value
- Returns: Boolean
- Indicates whether that value exists as a Node’s value somewhere within the list.

### toString

- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as:
- "{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- `.insert(int)`
  - TIME: O(n)
  - SPACE: O(1)

- `.includes(int)`
  - TIME: O(n)
  - SPACE: O(1)

- `.toString()`
  - TIME: O(n)
  - SPACE: O(n)

## API
<!-- Description of each method publicly available to your Linked List -->

### `.insert(int)`

- Construct node with given argument
- Check to see if Linked List is empty
  - If empty add the node to the head of the Linked List
- If not empty:
  - Start at head of Linked List
  - Create a while loop to loop through nodes until it reaches the end of the linked list
    - Assign node as the current nodes next value

### `.includes(int)`

- Check to see if Linked List is empty
  - If empty return false
- If not empty:
  - Start at head of Linked List
  - Create a while loop to loop through nodes
    - Check to see if the value of this node matches;
    - If the current node's value matches; return true
    - Continue on to the next node if the current node value does not match
  - Return false if value is not matched within the whileloop

### `.toString()`

- Create a new string
- Start from the beginning node
- Create a while loop to loop through nodes
  - Concatenate to the string with the current value node
    - Continue to the next node and repeat
  - Concatenate 'NULL' to the string after the while loop
    - Return the string