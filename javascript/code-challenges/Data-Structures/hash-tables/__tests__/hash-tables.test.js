'use strict';

const LinkedList = require('../linked-list.js');
const HashTable = require('../hash-tables.js');

describe('HashMap BASIC TESTS', () => {
  let people = new HashTable(16);


  it('Should successfully add a key/value to hashtable', () => {
    people.set('Jenner', 'Male');
    expect(people.has('Jenner')).toBe(true);
  });

  it('Retrieves based on a key and returns the value stored', () => {
    let data = people.get('Jenner');
    expect(data).toBeTruthy();
  });

  it('Returns NULL for a key that does not exist in the hashtable', () => {
    let data = people.get('WrongINfo');
    expect(data).toEqual(null);
  });

  it('Successfully handles a collision within the hashtable', () => {
    people.set('Jenner', 'Female');
    let data = people.get('WrongINfo');
    expect(data).toEqual(null);
  });

  it('Successfully retrieve a value from a bucket within the hashtable that has a collision', () => {
    let data = people.get('Jenner');
    expect(data).toBeTruthy();
  });

  it('Successfully retrieve a value from a bucket within the hashtable that has a collision', () => {
    people.set('Mark', 'Software Developer');
    let data = people.get('Mark');
    expect(data).toBeTruthy();
  });
});


