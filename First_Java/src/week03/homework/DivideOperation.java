package week03.homework;

public class DivideOperation implements AbstractOperation{

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}
