package Task;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        double result = 0;

        op op = new op();

        switch (operator) {
            case '+':
                result = op.add(num1, num2);
                break;
            case '-':
                result = op.sub(num1, num2);
                break;
            case '*':
                result = op.mult(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Not divisible by 0!");
                    break;
                } else

                    result = op.div(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);
    }
}

class op {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mult(int a, int b) {
        return a * b;
    }

    double div(double a, double b) {

        return a / b;
    }
}
