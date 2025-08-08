import java.util.Scanner;
public class Main {
    public static boolean snapChatLogin(String username, String password) {
        return username.equals("insta user") && password.equals("insta@123");
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the instagram username:");
        String username = data.nextLine();
        System.out.println("Enter the instagram password:");
        String password = data.nextLine();
        if (snapChatLogin(username, password)) {
            System.out.println("instagram login successful (simulated).");
        } else {
            System.out.println("instagram login failed (simulated).");
        }
        data.close();
    }
}
