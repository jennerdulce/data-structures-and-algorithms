'use strict';

let Queue = require('./fifo-animal-shelter.js');

let newQueue = new Queue();
newQueue.enqueue('Shiro', 'dog');
newQueue.enqueue('Fox', 'cat');
newQueue.enqueue('Abbie', 'cat');
newQueue.enqueue('Fang', 'dog');
newQueue.enqueue('Moon', 'cat');
console.log(newQueue.enqueue('Moon', 'frog'));
console.log(newQueue.dequeue('cat'));
