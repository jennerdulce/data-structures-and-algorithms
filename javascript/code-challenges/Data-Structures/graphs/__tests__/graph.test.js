'use strict';

const Graph = require('../graph.js');
const Edge = require('../edge.js');
const Vertex = require('../vertex.js');



describe('Testing for Vertex functionality', () => {
  let vertexA = new Vertex('A');
  it('Should create a new Vertex', () => {
    expect(vertexA.constructor.name).toBe('Vertex');
    expect(vertexA.value).toBe('A');
  });
});

describe('Testing for Edge functionality', () => {
  let vertexA = new Vertex('A');
  let newEdge = new Edge(vertexA, 10);
  it('Should create a new Edge', () => {
    expect(newEdge.constructor.name).toBe('Edge');
    expect(newEdge.vertex).toBe(vertexA);
    expect(newEdge.weight).toBe(10);
  });
});

describe('Testing for Graph functionality', () => {
  let newGraph = new Graph();
  let vertexA = new Vertex('A');
  let vertexB = new Vertex('B');
  let vertexC = new Vertex('C');
  it('Should create a new Graph', () => {
    expect(newGraph.constructor.name).toBe('Graph');
  });

  it('Should add a Vertex to the Graph', () => {
    newGraph.addVertex(vertexA);
    newGraph.addVertex(vertexB);
    newGraph.addVertex(vertexC);
    expect(newGraph.adjacencyList.size).toBe(3);
  });

  it('Should return all the neighbors of the selected Vertex', () => {
    newGraph.addDirectedEdge(vertexA, vertexB, 5);
    expect(newGraph.getNeighbors(vertexA).length).toBe(1);
  });

  it('Should return the size of the Graph', () => {
    newGraph.addDirectedEdge(vertexA, vertexB, 5);
    expect(newGraph.size()).toBe(3);
  });

  // Need Help
  xit('Should add a Directed Edge to a Vertex within the Graph', () => {
    //
  });

  // Need Help
  xit('Should retrieve all of the nodes of the Graph', () => {
    //
  });
});
