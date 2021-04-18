'use strict';


let Tree = require('../lib/tree.js');

describe('Tree Tests', () => {
  let newTree = new Tree();

  it('Can successfully instantiate an empty tree' , () => {
    expect(newTree).toBeTruthy();
  });

  it('Can successfully instantiate a tree with a single root node' , () => {
    newTree.add(9);
    expect(newTree.root.value).toEqual(9);
  });

  it('Can successfully add a left child and right child to a single root node' , () => {
    newTree.add(4);
    expect(newTree.root.left.value).toEqual(4);
    expect();
  });

  it('Can successfully return a collection from a preorder traversal' , () => {
    newTree.add(12);
    newTree.add(3);
    newTree.add(6);
    newTree.add(11);
    newTree.add(22);
    expect(newTree.preOrder(newTree.root)).toEqual([9, 4, 3, 6, 12, 11, 22]);
  });

  it('Can successfully return a collection from an inorder traversal' , () => {
    expect(newTree.inOrder(newTree.root)).toEqual([3, 4, 6, 9, 11, 12, 22]);
  });

  it('Can successfully return a collection from a postOrder traversal' , () => {
    expect(newTree.postOrder(newTree.root)).toEqual([3, 6, 4, 11, 22, 12, 9]);
  });

  it('Can successfully return the maximum value within the tree' , () => {
    expect(newTree.findMaximumValue(newTree.root)).toEqual(22);
  });
});
