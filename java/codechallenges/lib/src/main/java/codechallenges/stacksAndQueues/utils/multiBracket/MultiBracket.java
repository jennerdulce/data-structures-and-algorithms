package codechallenges.stacksAndQueues.utils.multiBracket;

import codechallenges.stacksAndQueues.Stack;
import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;

public class MultiBracket {

  public boolean bracketValidator(String string) throws Exception{
    Stack<Character> newStack = new Stack<>();
    HashMap<Character, Character> bracketMap = new HashMap<>();
    bracketMap.put('[', ']');
    bracketMap.put('(', ')');
    bracketMap.put('{', '}');
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '['){
        newStack.push(string.charAt(i));
      } else if (string.charAt(i) == ')' || string.charAt(i) == '}' || string.charAt(i) == ']') {
        Character topBracket = newStack.pop();
        if (string.charAt(i) != bracketMap.get(topBracket)){
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
