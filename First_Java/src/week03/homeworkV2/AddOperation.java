package week03.homeworkV2;

public class AddOperation implements AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber + secondNumber;
    }
}
