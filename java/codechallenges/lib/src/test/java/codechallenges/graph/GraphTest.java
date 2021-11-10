package codechallenges.graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

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
    assertEquals(bNode, sut.getNeighbors(aNode).indexOf(0));
  }

  @Test
  void get_nodes_graph()
  {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    System.out.println(sut.getNodes());
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
    assertEquals(null, sut.getNodes());
  }

  @Test
  void empty_graph()
  {
    Graph<String> sut = new Graph<>();
    System.out.println(sut);
//    assertEquals(expected, actual);
  }

  @Test
  void breadth_first_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");
    Vertex<String> dNode = sut.addNode("D");
    Vertex<String> eNode = sut.addNode("E");
    Vertex<String> fNode = sut.addNode("F");
    Vertex<String> gNode = sut.addNode("G");
    Vertex<String> hNode = sut.addNode("H");
    Vertex<String> iNode = sut.addNode("I");

    sut.addEdge(aNode, bNode, 0);
    sut.addEdge(bNode, aNode, 2);
    sut.addEdge(bNode, cNode, 2);
    sut.addEdge(bNode, dNode, 3);
    sut.addEdge(cNode, bNode, 4);
    sut.addEdge(cNode, eNode, 4);
    sut.addEdge(dNode, bNode, 4);
    sut.addEdge(dNode, eNode, 4);
    sut.addEdge(dNode, hNode, 4);
    sut.addEdge(eNode, gNode, 4);
    sut.addEdge(eNode, cNode, 4);
    sut.addEdge(eNode, dNode, 4);
    sut.addEdge(hNode, dNode, 4);
    sut.addEdge(hNode, fNode, 4);
    sut.addEdge(hNode, iNode, 4);
    sut.addEdge(fNode, hNode, 4);
    sut.addEdge(fNode, iNode, 4);
    sut.addEdge(iNode, fNode, 4);
    sut.addEdge(iNode, hNode, 4);
    assertEquals(9, sut.breadthFirst(cNode).size());
  }

  @Test
  void breadth_first_different_node_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");
    Vertex<String> dNode = sut.addNode("D");
    Vertex<String> eNode = sut.addNode("E");
    Vertex<String> fNode = sut.addNode("F");
    Vertex<String> gNode = sut.addNode("G");
    Vertex<String> hNode = sut.addNode("H");
    Vertex<String> iNode = sut.addNode("I");

    sut.addEdge(aNode, bNode, 0);
    sut.addEdge(bNode, aNode, 2);
    sut.addEdge(bNode, cNode, 2);
    sut.addEdge(bNode, dNode, 3);
    sut.addEdge(cNode, bNode, 4);
    sut.addEdge(cNode, eNode, 4);
    sut.addEdge(dNode, bNode, 4);
    sut.addEdge(dNode, eNode, 4);
    sut.addEdge(dNode, hNode, 4);
    sut.addEdge(eNode, gNode, 4);
    sut.addEdge(eNode, cNode, 4);
    sut.addEdge(eNode, dNode, 4);
    sut.addEdge(hNode, dNode, 4);
    sut.addEdge(hNode, fNode, 4);
    sut.addEdge(hNode, iNode, 4);
    sut.addEdge(fNode, hNode, 4);
    sut.addEdge(fNode, iNode, 4);
    sut.addEdge(iNode, fNode, 4);
    sut.addEdge(iNode, hNode, 4);
    assertEquals(9, sut.breadthFirst(gNode).size());
  }

  @Test
  void breadth_first_no_neighbors_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");
    Vertex<String> dNode = sut.addNode("D");
    Vertex<String> eNode = sut.addNode("E");
    Vertex<String> fNode = sut.addNode("F");
    Vertex<String> gNode = sut.addNode("G");
    Vertex<String> hNode = sut.addNode("H");
    Vertex<String> iNode = sut.addNode("I");

    sut.addEdge(bNode, cNode, 2);
    sut.addEdge(bNode, dNode, 3);
    sut.addEdge(cNode, bNode, 4);
    sut.addEdge(cNode, eNode, 4);
    sut.addEdge(dNode, bNode, 4);
    sut.addEdge(dNode, eNode, 4);
    sut.addEdge(dNode, hNode, 4);
    sut.addEdge(eNode, gNode, 4);
    sut.addEdge(eNode, cNode, 4);
    sut.addEdge(eNode, dNode, 4);
    sut.addEdge(hNode, dNode, 4);
    sut.addEdge(hNode, fNode, 4);
    sut.addEdge(hNode, iNode, 4);
    sut.addEdge(fNode, hNode, 4);
    sut.addEdge(fNode, iNode, 4);
    sut.addEdge(iNode, fNode, 4);
    sut.addEdge(iNode, hNode, 4);
    assertEquals(1, sut.breadthFirst(aNode).size());
  }

  @Test
  void business_trip_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> pandora = sut.addNode("pandora");
    Vertex<String> arendelle = sut.addNode("arendelle");
    Vertex<String> metroville = sut.addNode("metroville");
    Vertex<String> narnia = sut.addNode("narnia");
    Vertex<String> monstropolis = sut.addNode("monstropolis");
    Vertex<String> naboo = sut.addNode("naboo");

    sut.addEdge(pandora, arendelle, 150);
    sut.addEdge(pandora, metroville, 82);
    sut.addEdge(arendelle, pandora, 150);
    sut.addEdge(arendelle, metroville, 99);
    sut.addEdge(arendelle, monstropolis, 42);
    sut.addEdge(metroville, pandora, 82);
    sut.addEdge(metroville, arendelle, 99);
    sut.addEdge(metroville, monstropolis, 105);
    sut.addEdge(metroville, narnia, 37);
    sut.addEdge(metroville, naboo, 26);
    sut.addEdge(monstropolis, metroville, 105);
    sut.addEdge(monstropolis, arendelle, 42);
    sut.addEdge(monstropolis, naboo, 73);
    sut.addEdge(narnia, naboo, 250);
    sut.addEdge(narnia, metroville, 37);
    sut.addEdge(naboo, metroville, 26);
    sut.addEdge(naboo, narnia, 250);
    sut.addEdge(naboo, monstropolis, 73);

    ArrayList<Vertex<String>> stops = new ArrayList<>();
    stops.add(pandora);
    stops.add(arendelle);
    stops.add(monstropolis);
    String actual = "Cost: " + ( 150 + 42  );
    assertEquals(actual, sut.businessTrip(sut, stops));
  }

  @Test
  void business_trip_multiple_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> pandora = sut.addNode("pandora");
    Vertex<String> arendelle = sut.addNode("arendelle");
    Vertex<String> metroville = sut.addNode("metroville");
    Vertex<String> narnia = sut.addNode("narnia");
    Vertex<String> monstropolis = sut.addNode("monstropolis");
    Vertex<String> naboo = sut.addNode("naboo");

    sut.addEdge(pandora, arendelle, 150);
    sut.addEdge(pandora, metroville, 82);
    sut.addEdge(arendelle, pandora, 150);
    sut.addEdge(arendelle, metroville, 99);
    sut.addEdge(arendelle, monstropolis, 42);
    sut.addEdge(metroville, pandora, 82);
    sut.addEdge(metroville, arendelle, 99);
    sut.addEdge(metroville, monstropolis, 105);
    sut.addEdge(metroville, narnia, 37);
    sut.addEdge(metroville, naboo, 26);
    sut.addEdge(monstropolis, metroville, 105);
    sut.addEdge(monstropolis, arendelle, 42);
    sut.addEdge(monstropolis, naboo, 73);
    sut.addEdge(narnia, naboo, 250);
    sut.addEdge(narnia, metroville, 37);
    sut.addEdge(naboo, metroville, 26);
    sut.addEdge(naboo, narnia, 250);
    sut.addEdge(naboo, monstropolis, 73);

    ArrayList<Vertex<String>> stops = new ArrayList<>();
    stops.add(pandora);
    stops.add(arendelle);
    stops.add(monstropolis);
    stops.add(naboo);
    stops.add(narnia);
    stops.add(metroville);
    String actual = "Cost: " + ( 150 + 42 + 73 + 250 + 37 );
    assertEquals(actual, sut.businessTrip(sut, stops));
  }

  @Test
  void business_trip_one_city_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> pandora = sut.addNode("pandora");
    Vertex<String> arendelle = sut.addNode("arendelle");
    Vertex<String> metroville = sut.addNode("metroville");
    Vertex<String> narnia = sut.addNode("narnia");
    Vertex<String> monstropolis = sut.addNode("monstropolis");
    Vertex<String> naboo = sut.addNode("naboo");

    sut.addEdge(pandora, arendelle, 150);
    sut.addEdge(pandora, metroville, 82);
    sut.addEdge(arendelle, pandora, 150);
    sut.addEdge(arendelle, metroville, 99);
    sut.addEdge(arendelle, monstropolis, 42);
    sut.addEdge(metroville, pandora, 82);
    sut.addEdge(metroville, arendelle, 99);
    sut.addEdge(metroville, monstropolis, 105);
    sut.addEdge(metroville, narnia, 37);
    sut.addEdge(metroville, naboo, 26);
    sut.addEdge(monstropolis, metroville, 105);
    sut.addEdge(monstropolis, arendelle, 42);
    sut.addEdge(monstropolis, naboo, 73);
    sut.addEdge(narnia, naboo, 250);
    sut.addEdge(narnia, metroville, 37);
    sut.addEdge(naboo, metroville, 26);
    sut.addEdge(naboo, narnia, 250);
    sut.addEdge(naboo, monstropolis, 73);

    ArrayList<Vertex<String>> stops = new ArrayList<>();
    stops.add(pandora);
    assertEquals(null, sut.businessTrip(sut, stops));
  }

  @Test
  void business_trip_empty_array_graph()
  {
    Graph<String> sut = new Graph<>();
    Vertex<String> pandora = sut.addNode("pandora");
    Vertex<String> arendelle = sut.addNode("arendelle");
    Vertex<String> metroville = sut.addNode("metroville");
    Vertex<String> narnia = sut.addNode("narnia");
    Vertex<String> monstropolis = sut.addNode("monstropolis");
    Vertex<String> naboo = sut.addNode("naboo");

    sut.addEdge(pandora, arendelle, 150);
    sut.addEdge(pandora, metroville, 82);
    sut.addEdge(arendelle, pandora, 150);
    sut.addEdge(arendelle, metroville, 99);
    sut.addEdge(arendelle, monstropolis, 42);
    sut.addEdge(metroville, pandora, 82);
    sut.addEdge(metroville, arendelle, 99);
    sut.addEdge(metroville, monstropolis, 105);
    sut.addEdge(metroville, narnia, 37);
    sut.addEdge(metroville, naboo, 26);
    sut.addEdge(monstropolis, metroville, 105);
    sut.addEdge(monstropolis, arendelle, 42);
    sut.addEdge(monstropolis, naboo, 73);
    sut.addEdge(narnia, naboo, 250);
    sut.addEdge(narnia, metroville, 37);
    sut.addEdge(naboo, metroville, 26);
    sut.addEdge(naboo, narnia, 250);
    sut.addEdge(naboo, monstropolis, 73);

    ArrayList<Vertex<String>> stops = new ArrayList<>();
    assertEquals(null, sut.businessTrip(sut, stops));
  }
}
