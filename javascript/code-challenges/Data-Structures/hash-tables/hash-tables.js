'use strict';

const LinkedList = require('./linked-list.js');

// to avoid collisions:
// 1. Create a NEW hash table with doule the buckets
// 2. For each thing in the old hash table, .set() into the new
// 2a. Add the new thing
// 3. Delete old hash table

// NOTE:
// Even though under the hood, it's an array
// Even though my language's external implementation of Map allows it ...
// YOU MAY NOT (NOT!) iterate a hash map as a user

class HashMap {

  constructor(size) {
    this.size = size;
    this.map = new Array(size).fill();
  }

  // Return a number that equates to a bucket index
  hash(key) {
    let sumOfKeyLetters = key.split('').reduce((acc, val) => {
      let cc = val.charCodeAt(0);
      let num = acc + cc;
      return num;
    }, 0);

    let hash = sumOfKeyLetters * 599 % this.size;

    return hash;
  }

  // Add a key/value pair to the HT
  set(key, value) {
    let hash = this.hash(key); // should return a number that is an index of this.map

    if (!this.map[hash]) {
      this.map[hash] = new LinkedList();
    }

    let entry = { [key]: value };

    this.map[hash].append(entry);

  }

  // Return the value for the key from the HT
  get(key) {
    let LL;
    // 1: hash the key
    let hash = this.hash(key);
    // 2: Get the value of this.map[hash]
    if (this.map[hash]) {
      LL = this.map[hash];
      let node = LL.head;
      // 3: Traverse the linked list and find the actual one (because ... collisions)
      while (node) {
        if (node.value[key]) {
          // 4: Return what we find
          return node;
        }
        node = node.next;
      }
      // 4: Return what we find
    } else {
      return null;
    }
  }

  // return a bool if it's in the HT
  has(key) {
    let LL;
    // 1: hash the key
    let hash = this.hash(key);
    // 2: Get the value of this.map[hash]
    if (this.map[hash]) {
      LL = this.map[hash];
      let node = LL.head;
      // 3: Traverse the linked list and find the actual one (because ... collisions)
      while (node) {
        if (node.value[key]) {
          // 4: Return what we find
          return true;
        }
        node = node.next;
      }
      // 4: Return what we find
    } else {
      return null;
    }
  }
}

// classically -- 1024
// let people = new HashMap(4);
// people.set('Anne', 'Student');
// people.set('Taylor', 'Student');
// people.set('Michael', 'Student');
// people.set('Mark', 'Student');
// people.set('TJ', 'Student');
// people.set('Jenner', 'Student');
// people.set('Nassir', 'Student');
// people.set('Dawit', 'Student');
// people.set('Rosie', 'Dog');
// console.log(people.get('Mark'));
// console.log(people.has('Anne'));
// console.log(people.has('Rosie'));

// // Violation of all things holy
// people.map.forEach( (data,i) => {
//   console.log(i, data && data.print());
// });

module.exports = HashMap;
