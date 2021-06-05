"use strict";

const BST = require("./binary-search-tree.js");

function treeIntersection(bt1, bt2) {
  let values = {};
  let arr = [];
  let nodes1 = bt1.preOrder();
  let nodes2 = bt2.preOrder();
  let index = 0;

  for (let i = 0; i < nodes1.length; i++) {
    values[nodes1[i].toString()] = true;
  }

  for (let i = 0; i < nodes2.length; i++) {
    if (values[nodes2[i].toString()]) {
      arr[index] = nodes2[i];
      index++;
    }
  }
  console.log(values);

  return arr;
}

module.exports = treeIntersection;

// const bt1 = new BST();
// const bt2 = new BST();

// bt1.add(12).add(5).add(7).add(9).add(100).add(1);
// bt2.add(5).add(8).add(9).add(7).add(6).add(1);

// console.log(treeIntersection(bt1, bt2));
