import java.util.Scanner;

public class BioData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstname = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.print("Enter your year of birth: ");
        short yearOfBirth = scanner.nextShort();

        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();

        System.out.print("Enter your height in cm: ");
        float height = scanner.nextFloat();

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextFloat();

        System.out.print("Are you female? (true/false): ");
        boolean female= scanner.nextBoolean();
        
        System.out.print("Enter your blood group letter (A, B, O, etc.): ");
        char bloodGroup = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("\n--- Bio Data ---");
        System.out.println("firstName: " + firstname);
        System.out.println("lastName: " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height: " + height + " cm");
        System.out.println("weight: " + weight + " kg");
        System.out.println("female: " + female);
        System.out.println("Blood Group Letter: " + bloodGroup);
        

        scanner.close();
    }
}
