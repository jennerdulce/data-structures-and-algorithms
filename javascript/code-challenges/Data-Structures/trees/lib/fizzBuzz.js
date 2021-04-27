'use strict';

const Tree = require('./tree.js');

function fizzBuzz(node) {
  let newTree = new Tree();
  newTree.root = node;
  let walk = (tempNode) => {
    if (tempNode.value % 3 === 0 && tempNode.value % 5 === 0) {
      tempNode.value = 'FizzBuzz';
    } else if (tempNode.value % 5 === 0) {
      tempNode.value = 'Buzz';
    } else if (tempNode.value % 3 === 0) {
      tempNode.value = 'Fizz';
    } else {
      tempNode.value = tempNode.value.toString();
    }
    if (tempNode.children) {
      tempNode.children.forEach(child => {
        walk(child);
      });
    }
  };
  walk(newTree.root);
  return newTree;
}

module.exports = fizzBuzz;
