package lambdaExpressions;

import java.util.Arrays;

public class SortingStringByLength {

  public static void main(String[] args) {
    String[] inputArray = new String[] {"ashish", "vimal", "anshuman", "joe", "sterling"};
    Arrays.sort(inputArray, (s1, s2) -> s1.length() - s2.length());
    Utilities.printArray(inputArray);
  }
}
