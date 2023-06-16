package week03.homeworkV2;

public class MultiplyOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber * secondNumber;
    }
}
