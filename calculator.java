import java.util.Scanner;
public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }
    static double subtract(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = data.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = data.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = data.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("Result: " + result);
    }
}
