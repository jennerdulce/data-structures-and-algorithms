'use strict';

function quickSort(arr, left, right) {
  let position;
  if (arr.length > 1) {
    position = partition(arr, left, right);
    console.log('POSITION =========== ', position);
    if (left < position - 1) {
      quickSort(arr, left, position - 1);
    }

    if (position < right) {
      console.log(position, right);
      quickSort(arr, position, right);
    }
  }

  return arr;
}

function partition(arr, left, right) {
  let pivot = Math.floor((right + left) / 2);
  console.log('ARRAY =========== ', arr);
  console.log('PIVOT =========== ', pivot);
  let i = left;
  let j = right;
  while (i <= j) {
    while (arr[i] < arr[pivot]) {
      i++;
    }
    while (arr[j] > arr[pivot]) {
      j--;
    }
    if (i <= j) {
      console.log(`SWAPPING LEFT: ${arr[i]} and RIGHT: ${arr[j]}`);
      swap(arr, i, j);
      i++;
      j--;
      console.log( arr);
    }
  }
  console.log('I =========== ', i);
  return i;
}

function swap(arr, left, right) {
  let temp;
  temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
}
let arr = [4,5,3,1,2];
quickSort(arr, 0, arr.length-1);


module.exports = quickSort;

