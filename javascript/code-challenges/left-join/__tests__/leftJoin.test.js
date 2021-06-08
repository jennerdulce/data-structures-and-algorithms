'use strict';

const leftJoin = require("../leftJoin.js");


describe('Left Join Tests', () => {
  const mapLeft = new Map([
    ['fond', 'enamored'],
    ['wrath', 'anger'],
    ['diligent', 'employed'],
    ['outfit', 'garb'],
    ['guide', 'usher'],
  ]);

  const mapRight = new Map([
    ['fond', 'averse'],
    ['wrath', 'delight'],
    ['diligent', 'idle'],
    ['guide', 'follow'],
    ['flow', 'jam'],
  ]);

  it('Should successfully add values to hash tables', () => {

    expect(mapLeft.has('fond')).toBeTruthy();
    expect(mapRight.has('flow')).toBeTruthy();
  });

  it('Should return an array that has the "left-join" matching values.', () => {


    expect(leftJoin(mapLeft, mapRight))
      .toEqual(
        [
          [ 'fond', 'enamored', 'averse' ],
          [ 'wrath', 'anger', 'delight' ],
          [ 'diligent', 'employed', 'idle' ],
          [ 'outfit', 'garb', null ],
          [ 'guide', 'usher', 'follow' ]
        ]
      );
  });

  it('Should still return an array of values if the right map is empty', () => {
    const mapLeft2 = new Map([
      ['fond', 'enamored'],
      ['wrath', 'anger'],
      ['diligent', 'employed'],
      ['outfit', 'garb'],
      ['guide', 'usher'],
    ]);

    const mapRight2 = new Map();

    expect(leftJoin(mapLeft2, mapRight2))
      .toEqual(
        [
          [ 'fond', 'enamored', null ],
          [ 'wrath', 'anger', null ],
          [ 'diligent', 'employed', null ],
          [ 'outfit', 'garb', null ],
          [ 'guide', 'usher', null ]
        ]
      );
  });

  it('Should still return null if left map is empty', () => {
    const mapLeft3 = new Map();

    const mapRight3 = new Map([
      ['fond', 'averse'],
      ['wrath', 'delight'],
      ['diligent', 'idle'],
      ['guide', 'follow'],
      ['flow', 'jam'],
    ]);

    expect(leftJoin(mapLeft3, mapRight3).length).toBe(0);
  });
});
