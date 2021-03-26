# Stack and Queue
<!-- Short summary or background information -->
- Stack: Build a data structure that is built around a First in Last out concept
- Queue: Build a data structure that is built around a First in First out concept

## Challenge
<!-- Description of the challenge -->
- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

### Approach

#### Stack

- create a 'stack' class
- create 'top' and 'storage' propreties as part of the constructor

##### .push(item)

- push item into storage
- change this.top to pushed in item
- return the stack

##### .pop()

- remove item from stoage
- change top to last item on the list (which is technically the next item to be popped off)
- return stack

##### .peek()

- if there is no top, return false
- return the top

##### .isEmpty()

- if there is no top, return true

#### Queue

- create a 'queue' class
- create 'front', 'rear', 'storage' propreties as part of the constructor

##### .enqueue(item)

- if there is nothing in the queue, return 'empty queue'
- remove item from the front of the list
- if length is 0, set both front and rear to null
- if there are items in queue, set front to the first item in the storage. set rear to the last item in the storage

##### .dequeue()

- remove item from stoage
- change top to last item on the list (which is technically the next item to be popped off)
- return stack

##### .peek()

- if there is no top, return false
- return the top

##### .isEmpty()

- if length of storage is less than one (is empty || 0) return true

## API
<!-- Description of each method publicly available to your Linked List -->

### Big O

- Queue:
  - SPACE: O(1)
  - TIME: O(1)

- Stack:
  - SPACE: O(1)
  - TIME: O(1)

### Stack

- `.push(item)`
  - pushes item into the top of the storage

- `.pop()`
  - removes item at the top of the storage

- `.peek()`
  - retrieves item at the top of the storage

- `.isEmpty()`
  - checks to see if stack is empty

### Queue

- `.enqueue(item)`
  - pushes item into the end of the queue

- `.dequeue()`
  - removes item at the front of the queue

- `.peek()`
  - retrieves item at the front of the queue

- `.isEmpty()`
  - checks to see if queue is empty
