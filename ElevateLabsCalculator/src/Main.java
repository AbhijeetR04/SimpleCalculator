import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                double num1, num2, result;
                char operator;
                String choice;

                System.out.println("===== Java Console Calculator =====");

                do {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter operator (+, -, *, /): ");
                    operator = sc.next().charAt(0);

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            System.out.println("Result: " + result);
                            break;
                        case '-':
                            result = num1 - num2;
                            System.out.println("Result: " + result);
                            break;
                        case '*':
                            result = num1 * num2;
                            System.out.println("Result: " + result);
                            break;
                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                                System.out.println("Result: " + result);
                            } else {
                                System.out.println("Error: Cannot divide by zero.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operator!");
                    }

                    System.out.print("Do you want to perform another operation? (yes/no): ");
                    choice = sc.next();

                } while (choice.equalsIgnoreCase("yes"));

                System.out.println("Thank you!");
                sc.close();


    }
}