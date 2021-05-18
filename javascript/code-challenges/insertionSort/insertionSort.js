'use strict';

function insertionSort(arr){
  let x;
  let temp;
  for(let i = 1; i < arr.length; i++){
    x = i - 1;
    temp = arr[i];

    while(x >= 0 && arr[x] > temp){
      arr[x + 1] = arr[x];
      x = x - 1;
    }
    arr[x + 1] = temp;
  }
  return arr;
}

module.exports = insertionSort;
