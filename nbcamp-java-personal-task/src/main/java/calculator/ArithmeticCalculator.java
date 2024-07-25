package calculator;

import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator() {
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public int calculate(int num1, char operator, int num2) throws BadInputException{
        int result = 0;

        switch (operator) {
            case '+' -> result = addOperator.operate(num1, num2);
            case '-' -> result = subtractOperator.operate(num1, num2);
            case '*' -> result = multiplyOperator.operate(num1, num2);
            case '/' -> result = divideOperator.operate(num1, num2);
        }
        // Storing answer using JCF
        queue.add(result);
        return result;
    }

    // Remove the first answer of the operation.
    public void removeResult() {
        queue.poll();
    }

    // Print all the operation answers.
    public void inquiryResults() {
        System.out.print("Stored operation answers : ");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
