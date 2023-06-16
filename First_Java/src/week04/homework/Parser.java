package week04.homework;


import week03.homeworkV2.AddOperation;
import week03.homeworkV2.DivideOperation;
import week03.homeworkV2.MultiplyOperation;
import week03.homeworkV2.SubstractOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        Pattern pat = Pattern.compile(NUMBER_REG);
        Matcher matcher = pat.matcher(firstInput);
        if (!matcher.matches()) {
            throw new BadInputException("올바른 숫자");
        } else {
            calculator.setFirstNumber(Integer.parseInt(firstInput));
            return this;
        }

    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        Pattern pat = Pattern.compile(NUMBER_REG);
        Matcher matcher = pat.matcher(secondInput);
        if (!matcher.matches()) {
            throw new BadInputException("올바른 숫자");
        } else {
            calculator.setFirstNumber(Integer.parseInt(secondInput));
            return this;
        }
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        Pattern pat = Pattern.compile(OPERATION_REG);
        Matcher matcher = pat.matcher(operationInput);
        if (!matcher.matches()) {
            throw new BadInputException("올바른 사칙연산자");
        } else {
            switch (operationInput) {
                case "+" -> this.calculator.setOperation(new AddOperation());
                case "-" -> this.calculator.setOperation(new SubstractOperation());
                case "*" -> this.calculator.setOperation(new MultiplyOperation());
                case "/" -> this.calculator.setOperation(new DivideOperation());
            }

            return this;
        }
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
