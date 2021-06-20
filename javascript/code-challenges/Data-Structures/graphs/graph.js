'use strict';

const Edge = require("./edge.js");

class Graph {
  constructor(){
    this.adjacencyList = new Map();
  }

  addVertex(vertex){
    this.adjacencyList.set(vertex, []);
  }

  addDirectedEdge(startVertex, endVertex, weight = 0){
    let adjacencies = this.adjacencyList.get(startVertex);
    adjacencies.push(new Edge(endVertex, weight));
  }

  getNeighbors(vertex) {
    return this.adjacencyList.get(vertex);
  }

  getNodes(){
    return this.adjacencyList.keys();
  }

  size() {
    return this.adjacencyList.size;
  }
}

module.exports = Graph;
