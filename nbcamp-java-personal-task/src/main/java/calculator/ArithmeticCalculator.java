package calculator;

import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {

    public int calculate(int num1, char operator, int num2) throws BadInputException{
        Scanner sc = new Scanner(System.in);
        int result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) throw new BadInputException("0 cannot be used as a second parameter in division");
                else result = num1 / num2;
            }
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
