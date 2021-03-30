'use strict';
const Queue = require('../queue-with-stacks.js');

describe('QUEUE TESTS', () => {
  let newQueue = new Queue();

  it('Calling dequeue on empty queue raises exception', () => {

    expect(newQueue.dequeue()).toBeFalsy();
  });

  it('Can successfully instantiate an empty queue', () => {

    expect(newQueue).toBeTruthy();
  });

  it('Can successfully enqueue into a queue', () => {
    newQueue.enqueue(100);
    expect(newQueue.stack1.storage.length).toEqual(1);
  });

  it('Can successfully enqueue multiple values into a queue', () => {
    newQueue.enqueue(200).enqueue(300);
    expect(newQueue.stack1.storage.length).toEqual(3);
  });

  it('Can successfully dequeue out of a queue the expected value', () => {
    newQueue.dequeue();
    expect(newQueue.stack1.storage.length).toEqual(2);
  });

  it('Can successfully peek into a queue, seeing the expected value', () => {
    expect(newQueue.stack1.peek()).toEqual(200);
  });

  it('Can successfully empty a queue after multiple dequeues', () => {
    newQueue.dequeue();
    newQueue.dequeue();
    expect(newQueue.stack1.storage.length).toEqual(0);
  });
});
