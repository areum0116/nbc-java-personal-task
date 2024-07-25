package calculator;

import java.util.*;

public class Calculator {
    private Queue<Integer> queue = new LinkedList<>();  // Store the answer of the operations using JCF.

    public int calculate(int num1, char operator, int num2) throws BadInputException{
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
        return result;
    }
}
