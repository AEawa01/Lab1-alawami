package hw;

public class Main {
  public static void main(final String[] args) {
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

    for (int i =1; i <= max; i++)
    {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("fizz buzz");
      }
      else if (i % 3 == 0) {
        System.out.println("fizz");
      }
      else if (i % 5 ==0) {
        System.out.println("buzz");
      }
      else {
        System.out.println(i);
      }
    }
  }
}