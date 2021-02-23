'use strict';

let insertShiftArray = (arr, val) => {

  if (arr.length < 1) {
    arr[0] = val;

  } else if (arr.length === 1) {
    arr[1] = val;

  } else {
    
    var midIndex = Math.ceil(arr.length / 2);
    var temp = arr[midIndex];
    arr[midIndex] = val;

    for (let i = midIndex + 1; i <= arr.length; i++) {
      if (!arr[i]) {
        arr[i] = temp;
        break;
      }

      var save = arr[i];
      arr[i] = temp;
      temp = save;
    }
  }
  return arr;
};

module.exports = insertShiftArray;
