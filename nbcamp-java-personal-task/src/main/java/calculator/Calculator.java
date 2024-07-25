package calculator;

import java.util.*;

public class Calculator {
    private Queue<Integer> queue = new LinkedList<>();  // Store the answer of the operations using JCF.

    // getter
    public Queue<Integer> getQueue() {
        return queue;
    }

    // setter
    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

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

    public void removeResult() {
        queue.poll();
    }

    public void inquiryResults() {
        System.out.print("answer : ");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
