function bracketValidation(string) {
  if (typeof string !== 'string') {
    return null;
  }

  let stack = [];
  let map = {
    '(': ')',
    '[': ']',
    '{': '}'
  };
  // start from the beginning
  for (let i = 0; i < string.length; i++) {
    // if any opening bracket, add to stack
    if (string[i] === '(' || string[i] === '{' || string[i] === '[') {
      stack.push(string[i]);
      // the closing brace SHOULD MATCH what is on TOP of the stack / What was LAST added to the stack
    } else if (string[i] === ')' || string[i] === '}' || string[i] === ']'){
      let top = stack.pop();
      // if the closing brace is a matching pair of the opening brace at the TOP of the stack, the opening brace at the top is removed and the for loop continues
      if (string[i] !== map[top]) {
        return false;
      }
    }
  }
  // if anything is left in the stack then obviously string is not balanced
  if (stack.length !== 0) {
    return false;
  }
  return true;
}

module.exports = bracketValidation;
