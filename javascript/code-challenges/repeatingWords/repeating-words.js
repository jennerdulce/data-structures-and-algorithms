'use strict';
function repeatedWords(string) {
  let words = {};
  let currentWord = '';

  if (typeof string === typeof 'string') {
    for (let i = 0; i < string.length; i++) {
      if (string[i] === ' ') {
        if (words[currentWord]) {
          return currentWord;
        }
        words[currentWord.toLowerCase()] = true;
        currentWord = '';
        continue;
      }
      if (
        string[i] === ',' ||
        string[i] === '!' ||
        string[i] === '?' ||
        string[i] === '.' ||
        string[i] === '-'
      ) {
        continue;
      }
      currentWord = currentWord + string[i];
    }
    return null;
  } else {
    return null;
  }
}

module.exports = repeatedWords;
