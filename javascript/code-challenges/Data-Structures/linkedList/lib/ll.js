'use strict';

const Node = require('./node.js');

class LinkedList {
  constructor() {
    this.head = null;
  }

  insert(value) {
    // create a new node
    let node = new Node(value);

    // check to see if empty
    if (!this.head) {
      this.head = node;
    } else {
      // keeping the value of the old head
      let oldHead = this.head;

      // replace head with the new node
      this.head = node;

      // value of new head = oldHead
      this.head.next = oldHead;
    }
    return this;
  }

  includes(value) {
    if (!this.head) {
      return false;
    }

    let current = this.head;
    while (current) {
      if (current.value === value) {
        return true;
      }
      current = current.next;
    }
    return false;

  }

  toString() {
    let string = '';
    let current = this.head;
    while (current) {
      string += `{ ${current.value} } -> `;

      current = current.next;
    }

    string += 'NULL';
    return string;
  }
}

module.exports = LinkedList;
