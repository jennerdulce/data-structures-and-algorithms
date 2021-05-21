'use strict';
const { mergeSort } = require('../mergeSort');


describe('Merge Sort Tests', () => {
  it('Should sort an via Merge.', () => {
    let arr1 = [8, 4, 23, 42, 16, 15];
    let arr2 = [2, 1, 8, 4];
    let x = mergeSort(arr1);
    let y = mergeSort(arr2);
    expect(x).toEqual([ 4, 8, 15, 16, 23, 42 ]);
    expect(y).toEqual([ 1, 2, 4, 8 ]);
  });
});
