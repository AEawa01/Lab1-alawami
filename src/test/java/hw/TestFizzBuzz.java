package hw;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {
  FizzBuzz main = new FizzBuzz();

  @Test
  public void getMessage() {
    assertEquals(null, main.fizzBuzzArray(-10));
    assertEquals(null, main.fizzBuzzArray(-1));
    assertEquals(null, main.fizzBuzzArray(0));
    assertEquals(new String[]{"1"}, main.fizzBuzzArray(1));
    assertEquals(new String[]{"1","2","fizz","4","buzz","fizz","7"}, main.fizzBuzzArray(7));
    assertEquals(new String[]{"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizz buzz","16","17"}, main.fizzBuzzArray(17));
  }
}