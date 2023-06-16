package week03.homeworkV2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new SubstractOperation());
        double result = calculator.calculate(5, 3);
        System.out.println(result);
        System.out.println();


        calculator.setOperation(new MultiplyOperation());
        result = calculator.calculate(5, 3);
        System.out.println(result);
        System.out.println();

        calculator.setOperation(new DivideOperation());
        result = calculator.calculate(5, 3);
        System.out.println(result);
        System.out.println();

    }
}
