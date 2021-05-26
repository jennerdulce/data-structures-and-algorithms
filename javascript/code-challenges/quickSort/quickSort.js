'use strict';

function quickSort(arr, left, right) {
  let position;
  if (arr.length > 1) {
    position = partition(arr, left, right);

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
      swap(arr, i, j);
      i++;
      j--;
    }
  }

  return i;
}

function swap(arr, left, right) {
  let temp;
  temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
}

module.exports = quickSort;

