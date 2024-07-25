package calculator;

import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator2 arithmeticCalculator2;

    public int calculate(int num1, OperatorType operator, int num2) throws BadInputException{
        int result = 0;

        switch (operator) {
            case ADD -> arithmeticCalculator2 = new AddOperator();
            case SUBTRACT -> arithmeticCalculator2 = new SubtractOperator();
            case MULTIPLY -> arithmeticCalculator2 = new MultiplyOperator();
            case DIVIDE -> arithmeticCalculator2 = new DivideOperator();
            case MOD -> arithmeticCalculator2 = new ModOperator();
        }
        result = arithmeticCalculator2.operate(num1, num2);

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
