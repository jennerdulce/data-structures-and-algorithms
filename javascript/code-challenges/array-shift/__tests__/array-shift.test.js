'use strict';

const insertShiftArray = require('../array-shift.js');

describe('Insert Shift Array', () => {
  it('Test number into middle of array with ODD amount of intergers', () => {
    let myArray = [2, 4, 5, 6, 8];
    let expected = [2, 4, 5, 99, 6, 8];

    insertShiftArray(myArray, 99);
    expect(myArray).toEqual(expected);
  });

  it('Test number into middle of array with EVEN amount of intergers', () => {
    let myArray = [2, 4, 6, 8];
    let expected = [2, 4, 99, 6, 8];

    insertShiftArray(myArray, 99);
    expect(myArray).toEqual(expected);
  });

  it('Test an empty array', () => {
    let myArray = [];
    let expected = [99];

    insertShiftArray(myArray, 99);
    expect(myArray).toEqual(expected);
  });

});
