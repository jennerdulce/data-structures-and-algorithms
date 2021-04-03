'use strict';

const Animal = require('../animal.js');

describe('OBJECT TESTS', () => {
  it('should create a new CAT object', () => {
    let name = 'Cat';
    let testNode = new Animal.Cat(name);

    expect(testNode.name).toEqual(name);

  });

  it('should create a new Dog object', () => {
    let name = 'Dog';
    let testNode = new Animal.Dog(name);

    expect(testNode.name).toEqual(name);
  });
});
