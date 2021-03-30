'use strict';
let Stack = require('./stack.js');

class PseudoQueue {

  constructor() {
    this.stack1 = new Stack();
    this.stack2 = new Stack();
  }

  enqueue(value) {
    while (this.stack1.storage.length > 0) {
      let x = this.stack1.pop();
      this.stack2.push(x);
    }

    this.stack1.push(value);

    while (this.stack2.storage.length > 0) {
      let x = this.stack2.pop();
      this.stack1.push(x);
    }
    return this;
  }

  dequeue() {
    if (!this.stack1) {
      return null;
    }
    return this.stack1.pop();
  }
}

// let newQueue = new PseudoQueue();
// newQueue.enqueue(1);
// newQueue.enqueue(2);
// newQueue.enqueue(3);
// newQueue.enqueue(5);
// newQueue.dequeue();
// console.log(newQueue.stack1.storage);

module.exports = PseudoQueue;
