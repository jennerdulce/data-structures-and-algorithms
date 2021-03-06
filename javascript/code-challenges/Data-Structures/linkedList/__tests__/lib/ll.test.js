'use strict';

const LinkedList = require('../../lib/ll.js');


describe('LinkedList TESTS', () => {

  it('should successfully instantiate an empty linked list', () => {
    let newLL = new LinkedList();
    expect(newLL.head).toBeNull();
  });

  it('should properly insert into the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    newLL.insert(val);
    expect(newLL.head.value).toEqual(val);
  });

  it('The head property will properly point to the first node in the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    let newNode = newLL.insert(val);
    expect(newLL.head.value).toEqual(100);
  });

  it('Can properly insert multiple nodes into the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    newLL.insert(valOne);
    newLL.insert(valTwo);
    expect(newLL.head.value).toEqual(valTwo);
    expect(newLL.head.next.value).toEqual(valOne);
  });

  it('should return true when finding a value within the linked list that exists', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insert(valOne);
    newLL.insert(valTwo);
    newLL.insert(valThree);
    expect(newLL.includes(valThree)).toEqual(true);
  });

  it('should return false when searching for a value in the linked list that does not exist', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insert(valOne);
    newLL.insert(valTwo);
    newLL.insert(valThree);
    expect(newLL.includes(500)).toEqual(false);
  });

  it('Can properly return a collection of all the values that exist in the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insert(valOne);
    newLL.insert(valTwo);
    newLL.insert(valThree);
    expect(newLL.toString()).toEqual('{ 300 } -> { 200 } -> { 100 } -> NULL');
  });

  it('should return false if LinkedList is empty', () => {
    let newLL = new LinkedList();
    expect(newLL.includes(1)).toBeFalsy();
  });
});
