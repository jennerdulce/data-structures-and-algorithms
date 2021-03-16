'use strict';

let LinkedList = require('./ll.js');

module.exports = function zip(list1, list2) {
  let newList = new LinkedList();
  let counter;

  if (!list1.head || !list2.head){
    return false;
  }

  if (list1.length() > list2.length()) {
    counter = list2.length();
  } else {
    counter = list1.length();
  }

  let current1 = list1.head;
  let current2 = list2.head;

  while (counter > 0) {
    counter--;
    newList.append(current1.value);
    newList.append(current2.value);
    current1 = current1.next;
    current2 = current2.next;
  }

  if (current1) {
    while (current1) {
      newList.append(current1.value);
      current1 = current1.next;
    }
  }

  if (current2) {
    while (current2) {
      newList.append(current2.value);
      current2 = current2.next;
    }
  }
  return newList;

  // IN COLLABORATION WITH MARK
  // let firstCurrent = list1.head;
  // let secondCurrent = list2.head;
  // let firstNext;
  // let secondNext;
  // while (firstCurrent && secondCurrent) {
  //   firstNext = firstCurrent.next;
  //   secondNext = secondCurrent.next;
  //   secondCurrent.next = firstNext;
  //   firstCurrent.next = secondCurrent;
  //   if (firstNext === null) {
  //     secondCurrent = secondNext;
  //     break;
  //   }
  //   firstCurrent = firstNext;
  //   secondCurrent = secondNext;
  // }
  // if (secondCurrent) {
  //   firstCurrent.next = secondCurrent;
  // }
  // list2.head = secondCurrent;
  // return list1;
};
