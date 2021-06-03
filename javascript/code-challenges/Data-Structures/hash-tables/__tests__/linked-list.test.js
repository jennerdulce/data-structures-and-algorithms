'use strict';

const LinkedList = require('../linked-list.js');

describe('LinkedList BASIC TESTS', () => {

  it('should successfully instantiate an empty linked list', () => {
    let newLL = new LinkedList();
    expect(newLL.head).toBeNull();
  });

  it('should properly insert into the linked list', () => {
    let newLL = new LinkedList();
    let val = 100;
    newLL.append(val);
    expect(newLL.head.value).toEqual(val);
  });
});


