'use strict';

const zip = require('../../lib/zip.js');
const LinkedList = require('../../lib/ll.js');

describe('ZIPPED LINKED LIST', () => {

  it('should zip 2 even lists', () => {
    let LLA = new LinkedList();
    let LLB = new LinkedList();


    LLA.append(100).append(200).append(300);
    LLB.append('A').append('B').append('C');
    expect(zip(LLA, LLB).length()).toBe(6);
  });

  it('should zip 2 lists with the first list being longer than the second', () => {
    let LLA = new LinkedList();
    let LLB = new LinkedList();


    LLA.append(100).append(200).append(300).append(400).append(500);
    LLB.append('A').append('B').append('C');
    expect(zip(LLA, LLB).length()).toBe(8);
  });

  it('should zip 2 lists with the second list being longer than the first', () => {
    let LLA = new LinkedList();
    let LLB = new LinkedList();


    LLA.append(100).append(200).append(300);
    LLB.append('A').append('B').append('C').append('D').append('E');
    expect(zip(LLA, LLB).length()).toBe(8);
  });

  it('should return false if one or both lists are empty', () => {
    let LLA = new LinkedList();
    let LLB = new LinkedList();


    LLA.append(100).append(200).append(300);
    expect(zip(LLA, LLB)).toBeFalsy();
  });

});
