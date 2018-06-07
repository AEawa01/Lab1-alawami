package hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
  List<String> fizzBuzzList(final int n) {
    List<String> result;
    if(n <= 0){
      return null;
    }
    result = new ArrayList<>();
    for (int i =1; i <= n; i++)
    {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add("fizz buzz");
      }
      else if (i % 3 == 0) {
        result.add("fizz");
      }
      else if (i % 5 ==0) {
        result.add("buzz");
      }
      else {
        result.add(String.valueOf(i));
      }
    }
    return result;
  }

  public static void main(final String[] args) {
    Main main = new Main();
    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      }
      catch (NumberFormatException e) {
        System.err.println("The argument entered must be an integer ");
        //In our case, you can use
        System.exit(1);
      }
      /* Since you are trapping the error, youcan exit with a 0 instead of
       * 1.  By convention, a 0 means a normal exit (no error), and a non-
       * zero value means some type of error.  But it still ends the program
       * and returns to the OS.  So it’s more of a status message to you.
       */
    }

    List<String> res = main.fizzBuzzList(max);
    if(res!=null) {
      for (int j = 0; j < res.size(); j++) {
        System.out.println(res.get(j));
      }
    }
  }
}