package codechallenges.graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph<T extends Comparable<? super T>>
{
  private int size = 0;
  private LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyListsMap;  // LinkedHashMap is to retain insert order when outputting

  public Graph()
  {
    this.adjacencyListsMap = new LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>>() ;
  }

  Vertex<T> addNode(T value) {
    Vertex<T> newVertex = new Vertex<>(value);
    LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
    adjacencyListsMap.put(newVertex, newAdjacencyList);

    size++;
    return newVertex;
  }

  Set<Vertex<T>> getNodes() {
    if(adjacencyListsMap.keySet().size() == 0){
      return null;
    }
    return adjacencyListsMap.keySet();
  }

  String addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight) {
    if(adjacencyListsMap.size() == 0){
      return null;
    }
    Edge<T> newEdge = new Edge<>(destinationVertex, weight);
    LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(sourceVertex);
    adjacencyList.add(newEdge);
    return "Edge added successfully";
  }

  // Should be O(1) time, O(1) additional space
  List<Edge<T>> getNeighbors(Vertex<T> sourceVertex) {
    System.out.println(this.adjacencyListsMap.values());
    String string = "";
    for(Edge<T> edge : this.adjacencyListsMap.get(sourceVertex)){
      string += edge.destination + ": " + edge.weight + "\n";
    }
    System.out.println(string);
    return this.adjacencyListsMap.get(sourceVertex);
  }

  List<Vertex<T>> breadthFirst(Vertex<T> vertex){
    List<Vertex<T>> queue = new ArrayList<>();
    List<Vertex<T>> verticies = new ArrayList<>();
    List<Vertex<T>> visited = new ArrayList<>();
    queue.add(vertex);
    while(queue.size() > 0){
      Vertex<T> currentVertex = queue.remove(0);
      if(visited.contains(currentVertex)){
        continue;
      } else {
        verticies.add(currentVertex);
        visited.add(currentVertex);
        if(this.getNeighbors(currentVertex).size() > 0){
          for(Edge<T> edge : this.adjacencyListsMap.get(currentVertex)){
            queue.add(edge.destination);
          }
        }
      }
    }
    return verticies;
  }

  String businessTrip(Graph<T> graph, ArrayList<Vertex<T>> arr){
    if(arr.size() < 2){
      return null;
    }
    boolean hasNeighbor = false;
    int cost = 0;
    int i = 0;
    List<Edge<T>> neighbors;
    while( i < arr.size() - 1){
      neighbors = graph.getNeighbors(arr.get(i));
      for(Edge<T> neighbor : neighbors){
        if (neighbor.destination.value == arr.get(i + 1).value){
          cost += neighbor.weight;
          hasNeighbor = true;
        }
      }
      if(hasNeighbor == false){
        return null;
      }
      i++;
      hasNeighbor = false;
    }
    return "Cost: " + cost;
  }

  int size() {
    return this.size;
  }

  @Override
  public String toString()
    // check for empty return null
  {
    Set<Vertex<T>> vertices = adjacencyListsMap.keySet();
    String graphString = "";

    for (Vertex<T> vertex : vertices)
    {
      LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(vertex);
      graphString += vertex + ": ";
      for (Edge<T> edge : adjacencyList)
      {
        graphString += edge.destination.value + "(weight: " + edge.weight + ") -> ";
      }
      graphString += "NULL\n";
    }

    return graphString;
  }
}
