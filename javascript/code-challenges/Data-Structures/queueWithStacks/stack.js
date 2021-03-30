'use strict';


class Stack {
  constructor() {
    this.storage = [];
  }

  push(item) {
    this.storage.push(item);
    return this;
  }

  pop() {
    let x = this.storage.pop();
    this.top = !this.storage.length ? null : this.storage[this.storage.length - 1];
    return x;
  }

  peek() {
    if (!this.storage.length) {
      return false;
    }
    return this.storage[this.storage.length - 1];
  }
}

module.exports = Stack;
