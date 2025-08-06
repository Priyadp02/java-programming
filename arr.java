//basic
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array={"devi","pravee",
    "asmi","lali","arch","maha"};
        array[1]="arch";
        System.out.println(array[1]);
    }
}




//using for
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array = {"devi", "pravee", "asmi", "lali", "arch", "maha"};
        array[1] = "arch"; 
        System.out.println(array[1]); 
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}




//using if , updating
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array = {"devi", "pravee", "asmi", "lali", "arch", "maha"};
        array[1] = "arch"; 
        System.out.println(array[1]); 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
            if (array[i].equals("asmi")) {
                array[i] = "lali";
            }
        }
        System.out.println("Updated array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}




// user input
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = data.nextInt();  
        int[] array = new int[size];  
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = data.nextInt(); 
        }
        System.out.println("The elements in the array are:");
        for (int num : array) {
            System.out.println(num);
        }
        data.close(); 
    }
}






















