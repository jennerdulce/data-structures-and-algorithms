'use strict';

const arrayBinarySearch = require('../array-binary-search.js');

describe('Array Binary Search', () => {
  it('should find the given number and return the index of the array', () => {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    expect(arrayBinarySearch(arr, 3)).toEqual(2);
    expect(arrayBinarySearch(arr, 6)).toEqual(5);
  });

  it('should find the given number and return the index of the array.', () => {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    expect(arrayBinarySearch(arr, 3)).toEqual(2);
    expect(arrayBinarySearch(arr, 6)).toEqual(5);
  });

  it('should not find the number in the array and return \'-1\'.', () => {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    expect(arrayBinarySearch(arr, 99)).toEqual('-1');
  });

  it('should not find the number in the array and return an error.', () => {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    expect(arrayBinarySearch([], 99)).toEqual('Invalid data.');
    expect(arrayBinarySearch(arr, 'typing in a string')).toEqual('Invalid data.');
  });

  // STRETCH GOALS
  it('test with an array with a length of 100,000.', () => {
    let arr = [];
    let i = 1;
    while (i <= 100000) {
      arr.push(i);
      i++;
    }
    expect(arrayBinarySearch(arr, 41235)).toEqual(41234);
  });

  it('test with an array with a length of 10,000.', () => {
    let arr = [];
    let i = 1;
    while (i <= 10000) {
      arr.push(i);
      i++;
    }
    expect(arrayBinarySearch(arr, 5342)).toEqual(5341);
  });

  it('test with an array with a length of 100.', () => {
    let arr = [];
    let i = 1;
    while (i <= 100) {
      arr.push(i);
      i++;
    }
    expect(arrayBinarySearch(arr, 54)).toEqual(53);
  });
});
