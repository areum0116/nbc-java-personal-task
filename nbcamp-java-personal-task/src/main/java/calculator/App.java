package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter whether you want to 1.Do the operation or, 2.Get the area of the circle.");
            int input = sc.nextInt();

            if(input == 1) {    // operation
                System.out.print("Enter your first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter operator: ");
                char operator = sc.next().charAt(0);
                System.out.print("Enter your second number: ");
                double num2 = sc.nextDouble();

                // Using Enum
                HashMap<Character, OperatorType> operatorMap = new HashMap<Character, OperatorType>();
                operatorMap.put('+', OperatorType.ADD);
                operatorMap.put('-', OperatorType.SUBTRACT);
                operatorMap.put('*', OperatorType.MULTIPLY);
                operatorMap.put('/', OperatorType.DIVIDE);
                operatorMap.put('%', OperatorType.MOD);

                try{
                    double result = arithmeticCalculator.calculate(num1, operatorMap.get(operator), num2);
                    System.out.println(result);
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }

                // Using getter, setter method.
                Queue<Double> q = calculator.getQueue();
                calculator.setQueue(q);

                // Using removeResult method.
                System.out.print("Will you remove the first element? (Enter 'remove' to do so) : ");
                if(sc.next().equals("remove")) arithmeticCalculator.removeResult();

                // Using inquiryResults method.
                System.out.print("Enter 'inquiry' to see all the answers : ");
                if(sc.next().equals("inquiry")) arithmeticCalculator.inquiryResults();
            }
            else if(input == 2) {   // area of the circle
                System.out.print("Enter the radius : ");
                int r = sc.nextInt();
                double area = circleCalculator.calculateCircleArea(r);
                System.out.println("Area of the circle : " + area);
                circleCalculator.inquiryCircleResults();
            }

            System.out.print("continue? (Enter 'exit' to exit) : ");
            if(sc.next().equals("exit")) break;
        }
    }
}
