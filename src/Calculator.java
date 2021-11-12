


import java.util.Scanner;
/*Program to perform addition, subtraction, multiplication and division*/
public class Calculator {
    public static void main(String[] args) {
        int number1, number2;
        char operation;
        int result = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            number1 = sc.nextInt();
            System.out.println("Enter second number :");
            number2 = sc.nextInt();
            System.out.println("Enter the operation you want to perform ");
            operation = sc.next().charAt(0);
            if (operation == '+') {
                result = number1 + number2;
                System.out.println("Addition result is " + result);
            } else if (operation == '-') {
                result = number1 - number2;
                System.out.println("Subtraction result is " + result);
            } else if (operation == '*') {
                result = number1 * number2;
                System.out.println("Multiplication result is " + result);
            } else if (operation == '/') {
                result = number1 / number2;
                System.out.println("Division result is " + result);
            }
        }while(true);
    }
}