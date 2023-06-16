package week03.homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("+");

        double result = calculator.calculate(5, 2);
        System.out.println("result = " + result);
        System.out.println();

        calculator.setOperation("-");
        result = calculator.calculate(5, 2);
        System.out.println("result = " + result);
        System.out.println();

        calculator.setOperation("*");
        result = calculator.calculate(5, 2);
        System.out.println("result = " + result);
        System.out.println();

        calculator.setOperation("/");
        result = calculator.calculate(5, 2);
        System.out.println("result = " + result);
        System.out.println();
    }
}
