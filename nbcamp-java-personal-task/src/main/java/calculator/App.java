package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter operator: ");
            char operator = sc.next().charAt(0);
            System.out.print("Enter your second number: ");
            int num2 = sc.nextInt();

            try{
                int result = calculator.calculate(num1, operator, num2);
                System.out.println(result);
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            }

            // Using getter, setter method.
            Queue<Integer> q = calculator.getQueue();
            calculator.setQueue(q);

            // Using removeResult method.
            System.out.print("Will you remove the first element? (Enter 'remove' to do so) : ");
            if(sc.next().equals("remove")) calculator.removeResult();

            // Using inquiryResults method.
            System.out.print("Enter 'inquiry' to see all the answers : ");
            if(sc.next().equals("inquiry")) calculator.inquiryResults();

            System.out.print("continue? (Enter 'exit' to exit) : ");
            if(sc.next().equals("exit")) break;
        }
    }
}
