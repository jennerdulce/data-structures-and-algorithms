# Graph
<!-- Short summary or background information -->

- Graph:
  - A graph is a data structure for storing connected data like a network of people on a social media platform.
  - A graph consists of vertices and edges. A vertex represents the entity (for example, people) and an edge represents the relationship between entities (for example, a person's friendships).

## Challenge
<!-- Description of the challenge -->

Implement a Hashtable Class with the following methods:
- add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph
- add edge
  - Arguments: 2 nodes to be connected by the edge, weight (optional)
  - Returns: nothing
  - Adds a new edge between two nodes in the graph
  - If specified, assign a weight to the edge
  - Both nodes should already be in the Graph
- get nodes
  - Arguments: none
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- get neighbors
  - Arguments: node
  - Returns a collection of edges connected to the given node
  - Include the weight of the connection in the returned collection
- size
  - Arguments: none
  - Returns the total number of nodes in the graph
- breadthFirst
  - Arguments: Vertex<T>
  - Returns all of the verticies in the graph in breadth first order
- businessTrip
  - Arguments: Graph<T> graph, ArrayList<Vertex<T>> arr
  - Returns the cost if the business trip is possible
 - traversal
   - Arguments: Node (starting point of search)
   - Returns all of the nodes, depth first

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

### Approach

#### Graph

- Create a 'Graph' class

##### addNode((T value)

- Create a new vertex
- Create a new adjacency list (linked list)
- Add these two pieces of data to the adjacencyListMap using the new vertex as a key and the adjacency list as a value

##### getNodes()

- Retrieves all of the nodes (keys) of this graph

##### addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight)

- Create a new edge with the set parameters
  - Source Vertex
  - Destination Vertex
  - Weight
- Go into the adjacency list map and call a `.get()` with the source vertex
- Add this new edge to the retrieved adjacency list

##### getNeighbors(Vertex<T> sourceVertex)

- Retrieve the value using the sourceVertex
- Retrieve the values and return each vertex and their weight from the source vertex

##### size

- Return the size of the graph

##### breadthFirst

- Create a method that takes in a vertex
- Create a list to use as a queue
- Create a list to hold all of the verticies, will be returning this list later
- Create a list to account for all of the verticies that have already been visited
- Add the first vertex into the queue
- While loop through the queue
- Remove the vertex at index 0 from the queue
- Check to see if this vertex hasa already been visited
- Else Add this vertex to 'verticies' and 'visited' lists
- Check to see if this vertex has neighbors
  - If true, loop through each neighbor and add them to the queue
- Return the list of verticies

##### businessTrip

- Set some variables
  - Variable to keep track of weight between verticies
  - Index
  - Neighbors of verticies
  - A Boolean to see if the neighbor is valid
- Loop through the passed in array
  - Obtain a list of the neighbors of the current index
  - For each of the neighbors, check to see if the next index of the array is a neighbor
  - If it is true, change the boolean statement to verify that the next index of the array is in face a neighbor and add the weight to the total
  - If the boolean statement wasnt triggered in the previous, then the trip is not possible.. return a false statement
- Continue on to the next item in the array and reset the boolean to false
- Return true when finished

##### traversal

- Add current vertex to list of verticies
- If currentVertex does not have neighbors
  - Return list of verticies
- If currentVertex has neighbors
  - For each neighbor, run the traversal
- Return the list of veritices

## API
<!-- Description of each method publicly available to your Linked List -->

### Big O

- Graph:
  - SPACE: O(1)
  - TIME: O(1)

### HashMap

- `.addNode(T value)`
  - Adds a new node to the Graph
  - SPACE: O(1)
  - TIME: O(1)

- `.addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight)`
  - Connects to vertices together
  - SPACE: O(1)
  - TIME: O(1)

- `getNodes()`
  - Retrieves all of the nodes
  - SPACE: O(n)
  - TIME: O(n)

- `.getNeighbors(Vertex<T> sourceVertex)`
  - Retrieve the neighbors of the given source vertex
  - SPACE: O(1)
  - TIME: O(1)

- `.size()`
  - Return the size of the graph
  - SPACE: O(1)
  - TIME: O(1)

- `.breadthFirst(Vertex<T> vertex)`
  - Return all of the verticies in breadthFirst order
  - SPACE: O(n)
  - TIME: O(n)

 - `.businessTrip(Graph<T> graph, ArrayList<Vertex<T>> arr)`
   - Returns the cost if the business trip is possible
   - SPACE: O(log n)
   - TIME: O(n)

 - `.traversal(Vertex<T> currentVertex, ArrayList<Vertex<T>> listOfVerticies)`
   - Returns a list of nodes within the graph (depth first)
   - SPACE: O(log n)
   - TIME: O(n)
   
![WHITEBOARD](./assets/whiteboard.png)
![WHITEBOARD](./assets/businessTrip.png)
