import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23; otherwise, the method should return false.
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme13_hasSharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first Number: ");
        int fNum = scanner.nextInt();
        System.out.println("Please Enter the second number: ");
        int sNum = scanner.nextInt();
        boolean bool = hasSharedDigit(fNum, sNum);
        System.out.println("Digit appears in both numbers: " + bool);
        scanner.close();
    }

    public static boolean hasSharedDigit(int fNum, int sNum) {
        if (fNum < 10 || fNum > 99 || sNum < 10 || sNum > 99) {
            return false;
        }
        int digit1, digit2;
        while (fNum > 0) {
            digit1 = fNum % 10;
            while (sNum > 0) {
                digit2 = sNum % 10;
                if (digit1 == digit2) {
                    return true;
                }
                sNum /= 10;
            }
            fNum /= 10;
        }
        return false;
    }
}
