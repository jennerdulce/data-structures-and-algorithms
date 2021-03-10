'use strict';

const LinkedList = require('../../lib/ll.js');


describe('LinkedList BASIC TESTS', () => {

  it('should successfully instantiate an empty linked list', () => {
    let newLL = new LinkedList();
    expect(newLL.head).toBeNull();
  });

  it('should properly insert into the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    newLL.insertFront(val);
    expect(newLL.head.value).toEqual(val);
  });

  it('The head property will properly point to the first node in the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    let newNode = newLL.insertFront(val);
    expect(newLL.head.value).toEqual(100);
  });

  it('Can properly insert multiple nodes into the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    expect(newLL.head.value).toEqual(valTwo);
    expect(newLL.head.next.value).toEqual(valOne);
  });

  it('should return true when finding a value within the linked list that exists', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.includes(valThree)).toEqual(true);
  });

  it('should return false when searching for a value in the linked list that does not exist', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.includes(500)).toEqual(false);
  });

  it('Can properly return a collection of all the values that exist in the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.toString()).toEqual('{ 300 } -> { 200 } -> { 100 } -> NULL');
  });

  it('should return false if LinkedList is empty', () => {
    let newLL = new LinkedList();
    expect(newLL.includes(1)).toBeFalsy();
  });
});


describe('LinkedList BASIC TESTS', () => {

  it('should successfully instantiate an empty linked list', () => {
    let newLL = new LinkedList();
    expect(newLL.head).toBeNull();
  });

  it('should properly insert into the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    newLL.insertFront(val);
    expect(newLL.head.value).toEqual(val);
  });

  it('The head property will properly point to the first node in the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    let newNode = newLL.insertFront(val);
    expect(newLL.head.value).toEqual(100);
  });

  it('Can properly insert multiple nodes into the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    expect(newLL.head.value).toEqual(valTwo);
    expect(newLL.head.next.value).toEqual(valOne);
  });

  it('should return true when finding a value within the linked list that exists', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.includes(valThree)).toEqual(true);
  });

  it('should return false when searching for a value in the linked list that does not exist', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.includes(500)).toEqual(false);
  });

  it('Can properly return a collection of all the values that exist in the linked list', () => {
    let newLL = new LinkedList();
    let valOne = 100;
    let valTwo = 200;
    let valThree = 300;
    newLL.insertFront(valOne);
    newLL.insertFront(valTwo);
    newLL.insertFront(valThree);
    expect(newLL.toString()).toEqual('{ 300 } -> { 200 } -> { 100 } -> NULL');
  });

  it('should return false if LinkedList is empty', () => {
    let newLL = new LinkedList();
    expect(newLL.includes(1)).toBeFalsy();
  });
});


//====================================================================================

describe('LinkedList INSERTIONS TESTS', () => {

  it('Can successfully add a node to the end of the linked list', () => {
    let newLL = new LinkedList();
    newLL.append(100).append(200);
    expect(newLL.head.next.value).toBe(200);
  });

  it('Can successfully add multiple nodes to the end of a linked list', () => {
    let newLL = new LinkedList();
    newLL.append(100).append(200).append(300);
    expect(newLL.head.next.next.value).toBe(300);
  });

  it('Can successfully insert a node before a node located in the middle of a linked list', () => {
    let newLL = new LinkedList();
    newLL.append(100).append(200).append(300);
    newLL.insertBefore(200, 999);
    expect(newLL.head.next.value).toBe(999);
  });

  it('Can successfully insert a node before the first node of a linked list', () => {
    let newLL = new LinkedList();
    newLL.append(100).append(200).append(300);
    newLL.insertBefore(100, 999);
    expect(newLL.head.value).toBe(999);
  });

  it('Can successfully insert a node after the last node of the linked list', () => {
    let newLL = new LinkedList();
    newLL.append(100).append(200).append(300);
    newLL.insertAfter(300, 999);
    expect(newLL.toString()).toBe('{ 100 } -> { 200 } -> { 300 } -> { 999 } -> NULL');
  });
});


