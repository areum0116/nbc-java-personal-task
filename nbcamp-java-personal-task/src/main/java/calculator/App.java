package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
            }
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("0 cannot be used as a second parameter in division");
                    break;
                }
                else result = num1 / num2;
            }
        }
        System.out.println(result);
    }
}
