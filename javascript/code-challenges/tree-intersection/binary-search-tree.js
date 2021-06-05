"use strict";

const BinaryTree = require("./tree.js");
const Node = require("./node.js");

class BinarySearchTree extends BinaryTree {
  add(value) {
    let node = new Node(value);
    if (!this.root) {
      this.root = node;
      return this;
    }
    let current = this.root;
    //pointer for the previous node so we can assign left/right after traversal
    let prev = null;

    //Traverses the entire tree to get to a leaf
    while (current) {
      prev = current;
      if (value < current.value) {
        current = current.left;
      } else {
        current = current.right;
      }
    }

    // Checks prev values against passed value to see if the node belongs to the left or right
    if (value < prev.value) {
      prev.left = node;
    } else {
      prev.right = node;
    }
    return this;
  }

  addR(value, current = this.root) {
    if (!this.root) {
      this.root = new Node(value);
      return this;
    }

    if (!current) {
      return new Node(value);
    }

    if (current.value < value) {
      current.right = this.addR(value, current.right);
    } else {
      current.left = this.addR(value, current.left);
    }

    return current;
  }

  contains(value) {
    if (this.root === null) {
      return false;
    }

    let current = this.root;

    while (current) {
      if (value > current.value) {
        current = current.right;
      } else if (value < current.value) {
        current = current.left;
      } else {
        return true;
      }
    }
    return false;
  }
}

module.exports = BinarySearchTree;