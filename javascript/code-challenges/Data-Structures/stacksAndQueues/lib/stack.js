class Stack {
  constructor(){
    this.top = null;
    this.storage = [];
  }

  push(item){
    this.storage.push(item);
    this.top = item;
    return this;
  }

  pop() {
    this.storage.pop();
    this.top = !this.storage.length ? null : this.storage[this.storage.length - 1];
    return this;
  }

  peek() {
    if (!this.top){
      return false;
    }
    return this.top;
  }

  isEmpty() {
    if (!this.top){
      return true;
    }
  }
}


module.exports = Stack;
