'use strict';

let Node = require('./node.js');

class BinaryTree {
  constructor() {
    this.root = null;
  }

  preOrder(node, nodes=[]) {
    nodes.push(node.value);
    if(node.left) {this.preOrder(node.left, nodes);}
    if(node.right) {this.preOrder(node.right, nodes);}
    return nodes;
  }

  inOrder(node, nodes=[]) {
    if(node.left) {this.inOrder(node.left, nodes);}
    nodes.push(node.value);
    if(node.right) {this.inOrder(node.right, nodes);}
    return nodes;
  }

  postOrder(node, nodes=[]) {
    if(node.left) {this.postOrder(node.left, nodes);}
    if(node.right) {this.postOrder(node.right, nodes);}
    nodes.push(node.value);
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

  contains(value) {
    // O(n)
    // let nodes = this.preOrder(this.root);
    // if (nodes.includes(value)){
    //   return true;
    // } else {
    //   return false;
    // }
    let current = this.root;
    while(current){
      if (value === current.value){
        return true;
      }
      if(value > current.value){
        current = current.right;
      } else {
        current = current.left;
      }
    }
    return false;
  }
}

module.exports = BinarySearchTree;
