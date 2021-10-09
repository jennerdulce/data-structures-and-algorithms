package codechallenges.stacksAndQueues;

import codechallenges.stacksAndQueues.utils.multiBracket.MultiBracket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketValidationTest {
  @Test void bracket_validator_test() throws Exception{
    MultiBracket multiBracket = new MultiBracket();
    assertEquals(true, multiBracket.bracketValidator("{}"));
    assertEquals(true, multiBracket.bracketValidator("{}(){}"));
    assertEquals(true, multiBracket.bracketValidator("()[[Extra Characters]]"));
    assertEquals(true, multiBracket.bracketValidator("(){}[[]]"));
    assertEquals(true, multiBracket.bracketValidator("{}{Code}[Fellows](())"));
    assertEquals(false, multiBracket.bracketValidator("[({}]"));
    assertEquals(false, multiBracket.bracketValidator("(]("));
    assertEquals(false, multiBracket.bracketValidator("{(})"));
  }
}
