package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter operator: ");
            char operator = sc.next().charAt(0);
            System.out.print("Enter your second number: ");
            int num2 = sc.nextInt();


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
