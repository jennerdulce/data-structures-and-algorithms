"use strict";
function treeIntersection(bt1, bt2) {
  let values = {};
  let arr = [];
  let nodes1 = bt1.preOrder();
  let nodes2 = bt2.preOrder();
  let index = 0;
  if (nodes1) {
    for (let i = 0; i < nodes1.length; i++) {
      values[nodes1[i].toString()] = true;
    }
    if (nodes2) {
      for (let i = 0; i < nodes2.length; i++) {
        if (values[nodes2[i].toString()]) {
          arr[index] = nodes2[i];
          index++;
        }
      }
      return arr;
    } else {
      return null;
    }
  } else {
    return null;
  }
}

module.exports = treeIntersection;