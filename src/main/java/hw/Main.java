package hw;

public class Main {
  public String[] fizzBuzzArray(final int n){
    if(n <= 0){
      return null;
    }
    String result[] = new String[n];
    for (int i =1; i <= n; i++)
    {
      if (i % 3 == 0 && i % 5 == 0) {
        result[i-1] = "fizz buzz";
      }
      else if (i % 3 == 0) {
        result[i-1] = "fizz";
      }
      else if (i % 5 ==0) {
        result[i-1] = "buzz";
      }
      else {
        result[i-1] = String.valueOf(i);
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

    String result[] = main.fizzBuzzArray(max);
    if(result!=null)
      for(int i = 0;i<result.length;i++){
        System.out.println(result[i]);
      }
  }
}