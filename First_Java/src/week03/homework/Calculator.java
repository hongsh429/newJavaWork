package week03.homework;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(String operator) {
        switch (operator) {
            case "+" -> this.operation = new AddOperation();
            case "-" -> this.operation = new SubstractOperation();
            case "*" -> this.operation = new MultiplyOperation();
            case "/" -> this.operation = new DivideOperation();
        }
    }

    public void setOperation(String operator) {
        switch (operator) {
            case "+" -> this.operation = new AddOperation();
            case "-" -> this.operation = new SubstractOperation();
            case "*" -> this.operation = new MultiplyOperation();
            case "/" -> this.operation = new DivideOperation();
        }
    }

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }

}
