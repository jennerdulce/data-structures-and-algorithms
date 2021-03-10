'use strict';

const LL = require('./lib/ll.js');
const newLL = new LL();



// console.log(newLL.insertFront(100));
// console.log(newLL.insertFront(200));
// console.log(newLL.insertFront(300));
// console.log(newLL.insertBefore(300, 500));
// // console.log(newLL.insertAfter(200, 999));
// console.log(newLL.delete(200));
// console.log(newLL.insertFront(900));
// console.log(newLL.insertAfter(500, 999));
// console.log(newLL.append(696969699));

console.log(newLL.append(100).append(200).append(300));
console.log(newLL.insertAfter(300, 999));
console.log(newLL.toString());
