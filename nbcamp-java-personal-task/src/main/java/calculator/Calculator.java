package calculator;

import java.util.*;

public class Calculator {
    private Queue<Integer> queue = new LinkedList<>();  // Store the answer of the operations using JCF.
    private static final double PI = 3.14;
    // static -> can use without making an object.
    // final -> value that doesn't change.
    // static final -> constant. It's a fact, so you don't want to change it & don't need to make an object to use it.
    private ArrayList<Double> circleList = new ArrayList<>();   // Store the answer of the circle's area.

    // queue getter
    public Queue<Integer> getQueue() {
        return queue;
    }
    // queue setter
    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    // list getter
    public ArrayList<Double> getCircleList() {
        return circleList;
    }
    // list setter
    public void setCircleList(ArrayList<Double> circleList) {
        this.circleList = circleList;
    }

    // constructor
    public Calculator() {
        // initialize the collections
        queue = new LinkedList<>();
        circleList = new ArrayList<>();
    }

    // Return the area of the circle.
    public double calculateCircleArea(int radius) {
        double result = Math.pow(radius, 2) * PI;
        circleList.add(result);
        return result;
    }

    // Print all the circle area answers.
    public void inquiryCircleResults() {
        System.out.print("Stored circle area answers : ");
        for (Double v : circleList) {
            System.out.print(v + " ");
        }
        System.out.println();
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
