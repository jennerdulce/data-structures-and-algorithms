package codechallenges.graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class GraphTest {

  @Test
  void size_method_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    sut.addEdge(bNode, aNode, 3);
    sut.addEdge(cNode, aNode, 4);

    System.out.println(sut);
    System.out.println("Size: " + sut.size());
    System.out.println(sut.getNeighbors(aNode));
    assertEquals(3, sut.size());
  }

  @Test
  void get_neighbors_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    sut.getNeighbors(aNode);
//    assertEquals(2, sut.getNeighbors(aNode).size());
  }

  @Test
  void add_node_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> aNode = sut.addNode("A");
    assertEquals(1, sut.size());
  }

  @Test
  void add_edge_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    sut.addEdge(bNode, aNode, 3);
    sut.addEdge(cNode, aNode, 4);

    assertEquals(2, sut.getNeighbors(aNode).size());
    assertEquals(1, sut.getNeighbors(bNode).size());
    assertEquals(1, sut.getNeighbors(cNode).size());
  }

  @Test
  void to_string_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    sut.addEdge(bNode, aNode, 3);
    sut.addEdge(cNode, aNode, 4);
    String expected = "A: B(weight: 1) -> C(weight: 2) -> NULL\n" +
      "B: A(weight: 3) -> NULL\n" +
      "C: A(weight: 4) -> NULL\n";
    String actual = sut.toString();
    assertEquals(expected, actual);
  }

  @Test
  void one_node_and_edge_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");

    String actual = sut.toString();
//    assertEquals(expected, actual);
  }

  @Test
  void empty_graph()
  {
    Graph<String> sut = new Graph<>();
    System.out.println(sut);
//    assertEquals(expected, actual);
  }
}
