'use strict';

function leftJoin(mapLeft, mapRight) {
  let newMap = [];

  mapLeft.forEach((value, key) => {
    let newEntry = [];
    newEntry.push(key);
    newEntry.push(value);
    newEntry.push(mapRight.get(key) ? mapRight.get(key) : null);
    newMap.push(newEntry);
  });
  return newMap;
}

module.exports = leftJoin;

