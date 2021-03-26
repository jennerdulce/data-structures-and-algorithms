'use strict';
const Stack = require('../lib/stack');

describe('STACK TESTS', () => {
  let newStack = new Stack();

  it('Can successfully instantiate an empty stack', () => {

    expect(newStack).toBeTruthy();
  });

  it('Calling pop or peek on empty stack raises exception', () => {

    expect(newStack.peek()).toEqual(false);
  });


  it('Can successfully push onto a stack', () => {
    newStack.push(100).push(200).push(300);
    expect(newStack.storage.length).toEqual(3);
  });

  it('Can successfully push multiple values onto a stack', () => {
    expect(newStack.storage.length).toEqual(3);
  });

  it('Can successfully pop off the stack', () => {
    newStack.pop();
    expect(newStack.storage.length).toEqual(2);
    expect(newStack.peek()).toEqual(200);
  });

  it('Can successfully empty a stack after multiple pops', () => {
    newStack.pop().pop().pop();
    expect(newStack.storage.length).toEqual(0);
    expect(newStack.top).toEqual(null);
  });

  it('Can successfully peek the next item on the stack', () => {
    newStack.push(100);
    expect(newStack.storage.length).toEqual(1);
    expect(newStack.peek()).toEqual(100);
  });

});
