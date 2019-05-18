package lambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;

public class SortingIntegersUsingOldAndLambda {

  public static void main(String[] args) {
    Integer[] inputArray = new Integer[] {104, 34, 41, 8, 89, 52, 100};
    // sortUsingJava7(inputArray);
    sortUsingJava8(inputArray);
  }

  private static void sortUsingJava8(Integer[] inputArray) {
    // Arrays.sort(inputArray,(o1,o2)->o1.compareTo(o2));
    Arrays.sort(inputArray, (o1, o2) -> o2.compareTo(o1));
    printArray(inputArray);
  }

  private static void sortUsingJava7(Integer[] inputArray) {
    // Arrays.sort(inputArray);
    //    Arrays.sort(
    //        inputArray,
    //        new Comparator<Integer>() {
    //          @Override
    //          public int compare(Integer o1, Integer o2) {
    //            return o1.compareTo(o2);
    //          }
    //        });
    Arrays.sort(
        inputArray,
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
          }
        });
    printArray(inputArray);
  }

  public static void printArray(Integer[] inputArray) {
    for (int i : inputArray) {
      System.out.print(i + " ");
    }
  }
}
