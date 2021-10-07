package codechallenges.stacksAndQueues.utils.multiBracket;

import codechallenges.stacksAndQueues.Stack;

import java.util.HashMap;

public class multiBracket {

  public boolean bracketValidator(String string) throws Exception{
    Stack<String> newStack = new Stack<>();
    HashMap bracketMap = new HashMap<>();
    bracketMap.put('[', ']');
    bracketMap.put('(', ')');
    bracketMap.put('{', '}');
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '['){
        newStack.push(Character.toString(string.charAt(i)));
      } else if (string.charAt(i) == ')' || string.charAt(i) == '}' || string.charAt(i) == ']') {
        T topBracket = newStack.pop();
        if (string.charAt(i) != bracketMap.get(topBracket){
          return false;
        }
      }
    }
    if (newStack.top != null) {
      return false;
    }
    return true;
  }
}
