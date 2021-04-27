'use strict';

const Node = require('../lib/node.js');
const Tree = require('../lib/tree.js');
const fizzBuzz = require('../lib/fizzBuzz');

describe('Tree Tests', () => {
  let newTree = new Tree();

  // Fizzbuzz Tree
  let fizzTree = new Tree();
  let rootNode = new Node(3);
  let childNodeA = new Node(5);
  let childNodeB = new Node(15);
  let gcNodeA = new Node(1);
  let gcNodeB = new Node(2);
  let gcNodeC = new Node(10);
  let gcNodeD = new Node(11);
  let gcNodeE = new Node(6);
  //         3
  //    5         15
  //  1   2    10  11  6
  // Node 5
  childNodeA.children.push(gcNodeA);
  childNodeA.children.push(gcNodeB);
  // Node 15
  childNodeB.children.push(gcNodeC);
  childNodeB.children.push(gcNodeD);
  childNodeB.children.push(gcNodeE);
  rootNode.children.push(childNodeA);
  rootNode.children.push(childNodeB);
  // Add root Node
  fizzTree.root = rootNode;
  // let newTreeNode = new Node(node.value, node.children);
  // alteredTree.root = newTreeNode;

  it('Can successfully instantiate an empty tree', () => {
    expect(newTree).toBeTruthy();
  });

  it('Can successfully instantiate a tree with a single root node', () => {
    newTree.add(9);
    expect(newTree.root.value).toEqual(9);
  });

  it('Can successfully add a left child and right child to a single root node', () => {
    newTree.add(4);
    expect(newTree.root.left.value).toEqual(4);
    expect();
  });

  it('Can successfully return a collection from a preorder traversal', () => {
    newTree.add(12);
    newTree.add(3);
    newTree.add(6);
    newTree.add(11);
    newTree.add(22);
    expect(newTree.preOrder(newTree.root)).toEqual([9, 4, 3, 6, 12, 11, 22]);
  });

  it('Can successfully return a collection from an inorder traversal', () => {
    expect(newTree.inOrder(newTree.root)).toEqual([3, 4, 6, 9, 11, 12, 22]);
  });

  it('Can successfully return a collection from a postOrder traversal', () => {
    expect(newTree.postOrder(newTree.root)).toEqual([3, 6, 4, 11, 22, 12, 9]);
  });

  it('Can successfully return a collection in breadth first order', () => {
    expect(newTree.breadthFirst()).toEqual([9, 4, 12, 3, 6, 11, 22]);
  });

  it('Can successfully return the maximum value within the tree', () => {
    expect(newTree.findMaximumValue(newTree.root)).toEqual(22);
  });

  it('Can successfully before FizzBuzz on a tree.', () => {

    let x = Object.assign({}, rootNode);
    let node = fizzBuzz(x);
    console.log(JSON.stringify(node, undefined, 2));
    expect(node.root.value).toEqual('Fizz');
    expect(node.root.children[0].value).toEqual('Buzz');
    expect(node.root.children[0].children[0].value).toEqual('1');
    expect(node.root.children[0].children[1].value).toEqual('2');
    expect(node.root.children[1].value).toEqual('FizzBuzz');
    expect(node.root.children[1].children[0].value).toEqual('Buzz');
    expect(node.root.children[1].children[1].value).toEqual('11');
    expect(node.root.children[1].children[2].value).toEqual('Fizz');
  });
});
