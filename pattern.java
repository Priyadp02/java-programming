//pattern
public class Main {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <=n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print( j + " ");
            }
            System.out.println(); 
        }
    }
}

// reverse order
public class Main {
    public static void main(String[] args) {
        int n = 7;

        for (int i = n; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}


// rhombus

public class Main {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
           if (i == n) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//doublepyramid
public class DoublePyramid {
    public static void main(String[] args) {
        int n=6; 
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) 
            {
                System.out.print("- ");
            }
            for (int j=1;j<=(n-i)*2;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) 
            {
                System.out.print(" +");
            }
            System.out.println();
        }
    }
}



