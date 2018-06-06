package hw;

public class FizzBuzz {

    public String[] fizzBuzzArray(final int n) {
        if (n <= 0) {
            return null;
        }

        String result[] = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "fizz buzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }
}