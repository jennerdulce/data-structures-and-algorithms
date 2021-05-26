'use strict';
const quickSort = require('../quickSort');


describe('QuickSort Tests', () => {
  it('Should sort an via Quick.', () => {
    let arr1 = [8, 4, 23, 42, 16, 15];
    let arr2 = [2, 1, 8, 4];
    let arr3 = [5, 4, 2, 1, 3];
    let x = quickSort(arr1, 0, arr1.length - 1);
    let y = quickSort(arr2, 0, arr2.length - 1);
    let z = quickSort(arr3, 0, arr3.length - 1);
    expect(x).toEqual([ 4, 8, 15, 16, 23, 42 ]);
    expect(y).toEqual([ 1, 2, 4, 8 ]);
    expect(z).toEqual([ 1, 2, 3, 4, 5]);
  });
});
