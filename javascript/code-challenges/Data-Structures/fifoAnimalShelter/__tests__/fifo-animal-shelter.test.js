'use strict';
const Queue = require('../fifo-animal-shelter');

describe('QUEUE TESTS', () => {
  let newQueue = new Queue();

  it('Calling dequeue or peek on empty queue raises exception', () => {

    expect(newQueue.peek()).toBeFalsy();
  });

  it('Can successfully instantiate an empty queue', () => {

    expect(newQueue).toBeTruthy();
  });

  it('Can successfully enqueue into a queue', () => {
    newQueue.enqueue('Fang', 'dog');
    expect(newQueue.storage.length).toEqual(1);
  });

  it('Can successfully enqueue multiple values into a queue', () => {
    newQueue.enqueue('Shiro', 'dog').enqueue('Felix', 'cat');
    expect(newQueue.storage.length).toEqual(3);
  });

  it('Can successfully dequeue a dog out of a queue the expected value', () => {
    newQueue.dequeue('dog');
    expect(newQueue.storage.length).toEqual(2);
  });

  it('Can successfully dequeue a cat out of a queue the expected value', () => {
    newQueue.dequeue('cat');
    expect(newQueue.storage.length).toEqual(1);
  });

  it('Can successfully peek into a queue, seeing the expected value', () => {
    expect(newQueue.peek().name).toEqual('Shiro');
  });

  it('Can successfully empty a queue after multiple dequeues', () => {
    newQueue.dequeue('dog');
    expect(newQueue.storage.length).toEqual(0);
    expect(newQueue.front).toEqual(null);
    expect(newQueue.rear).toEqual(null);
  });

  it('Should return "null" when attempting to add an animal that is not a dog or cat', () => {
    expect(newQueue.enqueue('Froggy', 'frog')).toBeFalsy();
  });
});
