package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[10];    // Store the answer of the operations.
        int index = 0;      // Store array's last index
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter operator: ");
            char operator = sc.next().charAt(0);
            System.out.print("Enter your second number: ");
            int num2 = sc.nextInt();

            int result = 0;

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) System.out.println("0 cannot be used as a second parameter in division");
                    else result = num1 / num2;
                }
            }
            System.out.println("result : " + result);
            arr[index++] = result;
            
            System.out.print("continue? (Enter exit to exit) : ");
            if(sc.next().equals("exit")) break;
        }
    }
}
