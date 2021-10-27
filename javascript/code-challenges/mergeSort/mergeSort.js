'use strict';

function mergeSort(arr) {
  // console.log(arr);
  let n = arr.length;
  let mid = n / 2;

  if (n < 2) {
    return arr;
  }
  let left = arr.splice(0, mid);
  return merge(mergeSort(left), mergeSort(arr));
}

function merge(left, right, arr = []) {
  let k = 0;
  // console.log('left', left, 'right', right);
  while (left.length && right.length) {
    if (left[0] < right[0]) {
      arr[k] = left.shift();
    } else {
      arr[k] = right.shift();
    }
    k++;
  }

  if (left.length) {
    while (left.length) {
      arr[k] = left.shift();
      k++;
    }
  } else if (right.length) {
    while (right.length) {
      arr[k] = right.shift();
      k++;
    }
  }
  return arr;
}

module.exports = {
  merge: merge,
  mergeSort: mergeSort
};
