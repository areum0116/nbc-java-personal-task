package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[10];    // Store the answer of the operations using array.
        int index = 0;      // Store array's last index

        Queue<Integer> queue = new LinkedList<>();  // Store the answer of the operations using JCF.

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

            // Storing answer using array
            if(index == 10) {
                int[] tmp = arr.clone();
                for (int i = 1; i < 10; i++) {
                    arr[i-1] = tmp[i];
                }
                arr[9] = result;
            }
            else
                arr[index++] = result;

            // Storing answer using JCF
            queue.add(result);
            System.out.print("Will you remove the first element? (Enter 'remove' to do so) : ");
            if(sc.next().equals("remove")) queue.poll();

            System.out.print("Enter 'inquiry' to see all the answers : ");
            if(sc.next().equals("inquiry")) {
                System.out.print("answer : ");
                for (Integer i : queue) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.print("continue? (Enter 'exit' to exit) : ");
            if(sc.next().equals("exit")) break;
        }
    }
}
