'use strict';

const Node = require('../lib/node.js');

describe('NODE TESTS', () => {
  it('should create a new node', () => {
    let val = 100;
    let testNode = new Node(100);

    expect(testNode.value).toEqual(val);
    expect(testNode.next).toBeNull();
  });
});
