package lambdaExpressions.CalculatorExample;

public class Calculator {
  public static void main(String[] args) {
    // below are the functions
    CalculatorInterface addition = (x, y) -> x + y;
    CalculatorInterface substraction = (x, y) -> x - y;
    CalculatorInterface multiplication = (x, y) -> x * y;
    CalculatorInterface division = (x, y) -> x / y;
    // calling each functions ref
    System.out.println(addition.calculate(234, 567));
    System.out.println(substraction.calculate(234, 567));
    System.out.println(multiplication.calculate(234, 567));
    System.out.println(division.calculate(234, 567));
  }
}
