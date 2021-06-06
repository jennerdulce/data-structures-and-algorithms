'use strict';

const BST = require("../binary-search-tree.js");
const treeIntersection = require("../tree-intersection.js");


describe('Tree intersection tests', () => {
  it('Should return an array that has the matching values.', () => {
    const bt1 = new BST();
    const bt2 = new BST();

    bt1.add(12).add(5).add(7).add(9).add(100).add(1);
    bt2.add(5).add(8).add(9).add(7).add(6).add(1);

    expect(treeIntersection(bt1, bt2)).toEqual([ 5, 1, 7, 9 ]);
  });

  it('Should return an array that has the matching values.', () => {
    const bt3 = new BST();
    const bt4 = new BST();

    bt3.add(1).add(2).add(3);
    bt4.add(3).add(2).add(1);

    expect(treeIntersection(bt3, bt4)).toEqual([ 3, 2, 1 ]);
  });

  it('Should return a falsy statement if using an empty BST has been used', () => {
    const bt5 = new BST();
    const bt6 = new BST();

    expect(treeIntersection(bt5, bt6)).toBeFalsy();
  });
});
