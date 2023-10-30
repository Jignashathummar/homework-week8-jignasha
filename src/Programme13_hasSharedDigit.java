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

    /**
     * static method for two input number is share digit or not
     * @param num1
     * @param num2
     * @return
     */

    public static boolean hasSharedDigit(int num1, int num2) {
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int num1FirstDigit = num1 / 10;
        int num2FirstDigit = num2 / 10;

        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99) && (digit2 == digit1 || digit1 == num2FirstDigit || digit2 == num1FirstDigit || num1FirstDigit == num2FirstDigit)) {
            return true;
        }
        return false;

//        if (fNum < 10 || fNum > 99 || sNum < 10 || sNum > 99) {
//            return false;
//        }
//        int digit1, digit2;
//        while (fNum > 0) {
//            digit1 = fNum % 10;
//            while (sNum > 0) {
//                digit2 = sNum % 10;
//                if (digit1 == digit2) {
//                    return true;
//                }
//                sNum /= 10;
//            }
//            fNum /= 10;
//        }
//        return false;

    }

}
