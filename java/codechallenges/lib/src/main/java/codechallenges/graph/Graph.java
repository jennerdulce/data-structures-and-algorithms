package codechallenges.graph;

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

  Vertex<T> addNode(T value)
  {
    Vertex<T> newVertex = new Vertex<>(value);
    LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
    adjacencyListsMap.put(newVertex, newAdjacencyList);

    size++;
    return newVertex;
  }

  Set<Vertex<T>> getNodes()
  {
    return adjacencyListsMap.keySet();
  }

  void addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight)
  {
    Edge<T> newEdge = new Edge<>(destinationVertex, weight);
    LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(sourceVertex);
    adjacencyList.add(newEdge);
  }

  // Should be O(1) time, O(1) additional space
  List<Edge<T>> getNeighbors(Vertex<T> sourceVertex)
  {
    System.out.println(this.adjacencyListsMap.values());
    String string = "";
//    for(Edge<T> edge : this.adjacencyListsMap.get(sourceVertex)){
//      string += edge.
//    }
    return this.adjacencyListsMap.get(sourceVertex);
  }

  int size()
  {
//    if(size == 0){
//      return null;
//    }
    return this.size;
  }

  @Override
  public String toString()
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
