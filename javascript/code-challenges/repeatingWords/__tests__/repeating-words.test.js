'use strict';

const repeatingWords = require('../repeating-words.js');

describe('Repeating Words Tests', () => {
  it('Should return the first word that is repeated', () => {
    let sentence1 = 'Once upon a time, there was a brave princess who...';
    expect(repeatingWords(sentence1)).toEqual('a');
  });

  it('Should display working functionality in conjunction with Case Sensitivity', () => {
    let sentence2 =  'It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...';
    expect(repeatingWords(sentence2)).toEqual('it');
  });

  it('Should return a falsy statement if argument is not a string', () => {
    let sentence3 = ['Once upon a time, there was a brave princess who...'];
    expect(repeatingWords(sentence3)).toBeFalsy();
  });

  it('Should return a falsy statement if no repeating word', () => {
    let sentence4 = 'Hello World';
    expect(repeatingWords(sentence4)).toBeFalsy();
  });

});
