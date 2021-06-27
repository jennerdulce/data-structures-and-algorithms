'use strict';

function businessTrip(graph, arr){
  let hasNeighbor = false;
  let total = 0;
  let i = 0;
  let neighbors;

  while(i < arr.length - 1){
    neighbors = graph.getNeighbors(arr[i]);

    neighbors.forEach(obj => {
      if(obj.vertex === arr[i+1]){
        total += obj.weight;
        hasNeighbor = true;
      }
    });
    if(hasNeighbor === false){
      return `False, $${0}`;
    }
    i++;
    hasNeighbor = false;
  }
  return `True, $${total}`;
}

module.exports = businessTrip;
