package calculator;

import java.util.stream.*;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator2 arithmeticCalculator2;

    public <T> double calculate(T num1, OperatorType operator, T num2) throws BadInputException{
        double result = 0;

        switch (operator) {
            case ADD -> arithmeticCalculator2 = new AddOperator();
            case SUBTRACT -> arithmeticCalculator2 = new SubtractOperator();
            case MULTIPLY -> arithmeticCalculator2 = new MultiplyOperator();
            case DIVIDE -> arithmeticCalculator2 = new DivideOperator();
            case MOD -> arithmeticCalculator2 = new ModOperator();
        }
        result = arithmeticCalculator2.operate((Double) num1, (Double) num2);

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
        for (double i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Print answers bigger than an input number
    public void printBiggerAnswers(int n) {
        queue.stream().filter(i -> i > n).forEach(System.out::println);
    }
}
