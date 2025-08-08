public class AutophobicNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            String numberStr = Integer.toString(i);
            String squareStr = Integer.toString(square);
            if (squareStr.contains(numberStr)) {
                System.out.println(i + " squared is " + square + " -> " + numberStr + " is found in " + squareStr);
            }
        }
    }
}
