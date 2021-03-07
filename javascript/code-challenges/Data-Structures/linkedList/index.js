'use strict';

const LL = require('./lib/ll.js');
const newLL = new LL();



console.log(newLL.insert(100));
console.log(newLL.insert(200));
console.log(newLL.insert(300));
console.log(newLL.includes(300));
console.log(newLL.toString());
