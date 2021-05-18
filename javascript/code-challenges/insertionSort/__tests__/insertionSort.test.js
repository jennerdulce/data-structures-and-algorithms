'use strict';

const insertionSort = require('../insertionSort.js')

describe('Insertion Sort Tests', () => {
  it('Should sort an unsorted array', () => {
    let arr1 = [2, 5, 3, 1];
    let arr2 = [2, 5, 3, 1, 1, 6];
    let x = insertionSort(arr1);
    let y = insertionSort(arr2);
    expect(x).toEqual([1, 2, 3, 5]);
    expect(y).toEqual([1, 1, 2, 3, 5, 6]);
  });
});
