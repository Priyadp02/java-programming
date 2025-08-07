import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println(num + " is an Ugly Number.");
            scanner.close();
            return;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        if (num == 1) {
            System.out.println("Strong Number");
        } else {
            System.out.println(" Ugly Number");
        }
        scanner.close();
    }
}
