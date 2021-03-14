'use strict';

const LL = require('./lib/ll.js');
const newLL = new LL();
console.log(newLL.append(100).append(200).append(300));
console.log(newLL.insertAfter(300, 999));
console.log(newLL.toString());
