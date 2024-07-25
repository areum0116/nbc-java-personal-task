package calculator;

import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator2 arithmeticCalculator2;

    public int calculate(int num1, char operator, int num2) throws BadInputException{
        int result = 0;

        switch (operator) {
            case '+' -> arithmeticCalculator2 = new AddOperator();
            case '-' -> arithmeticCalculator2 = new SubtractOperator();
            case '*' -> arithmeticCalculator2 = new MultiplyOperator();
            case '/' -> arithmeticCalculator2 = new DivideOperator();
            case '%' -> arithmeticCalculator2 = new ModOperator();
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
