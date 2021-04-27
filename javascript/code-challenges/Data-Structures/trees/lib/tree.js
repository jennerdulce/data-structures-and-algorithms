'use strict';

let Node = require('./node.js');

class BinaryTree {
  constructor() {
    this.root = null;
  }

  preOrder(node, nodes = []) {
    nodes.push(node.value);
    if (node.left) { this.preOrder(node.left, nodes); }
    if (node.right) { this.preOrder(node.right, nodes); }
    return nodes;
  }

  inOrder(node, nodes = []) {
    if (node.left) { this.inOrder(node.left, nodes); }
    nodes.push(node.value);
    if (node.right) { this.inOrder(node.right, nodes); }
    return nodes;
  }

  postOrder(node, nodes = []) {
    if (node.left) { this.postOrder(node.left, nodes); }
    if (node.right) { this.postOrder(node.right, nodes); }
    nodes.push(node.value);
    return nodes;
  }

  breadthFirst() {
    let nodes = [];
    let queue = [];
    queue.push(this.root);
    while (queue.length) {
      let currentNode = queue.shift();
      nodes.push(currentNode.value);
      if (currentNode.left) { queue.push(currentNode.left); }
      if (currentNode.right) { queue.push(currentNode.right); }
    }
    return nodes;
  }
}

class BinarySearchTree extends BinaryTree {
  add(value, current = this.root) {
    const newNode = new Node(value);
    if (!this.root) {
      this.root = newNode;
    }
    if (!current) {
      return newNode;
    }
    // traverse Right
    if (newNode.value > current.value) {
      current.right = this.add(value, current.right);
    } else { // traverse Left
      current.left = this.add(value, current.left);
    }
    return current;
  }

  contains(value, node = this.root) {
    // recursion
    if (value === node.value) { return true; }
    if (value > node.value) { this.contains(value, node.right); }
    if (value < node.value) { this.contains(value, node.left); }
    return false;

    // let current = this.root;
    // while (current) {
    //   if (value === current.value) {
    //     return true;
    //   }
    //   if (value > current.value) {
    //     current = current.right;
    //   } else {
    //     current = current.left;
    //   }
    // }
    // return false;
  }

  findMaximumValue(node, largest = 0) {
    let queue = [];
    queue.push(this.root);
    while (queue.length) {
      let currentNode = queue.shift();
      largest = currentNode.value > largest ? currentNode.value : largest;
      if (currentNode.left) { queue.push(currentNode.left); }
      if (currentNode.right) { queue.push(currentNode.right); }
    }
    return largest;
  }
}

module.exports = BinarySearchTree;


// let karyTreeFizzBuzz = (kTree) => {
//   let newTree = new Node(kTree);
//   let trek = (node) => {
//     if (node.children) {
//       node.children.forEach(child => {
//         if (child.val % 15 === 0) { child.val = `FizzBuzz`; }
//         else if (child.val % 3 === 0) { child.val = `Fizz`; }
//         else if (child.val % 5 === 0) { child.val = `Buzz`; }
//       });
//     }
//     if (node.children) { node.children.forEach(child => { trek(child) }); }
//   };
//   trek(newTree);
//   // console.log(JSON.stringify(newTree, null, 4));
//   console.log('KTREE', kTree)
//   return JSON.stringify(newTree, null, 2)
// };