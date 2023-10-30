import java.util.Scanner;
/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11_EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        int evensum = getEvenDigitSum(num);
        System.out.println(evensum);
        scanner.close();
    }

    /**
     * static method for sum of even input number digits
     *
     * @param number
     * @return
     */
    public static int getEvenDigitSum(int number) {
        int sumOfEvenDigit = 0;
        if (number < 0) {
            return -1;
        }
        int digit;

        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sumOfEvenDigit = sumOfEvenDigit + digit;
            }
            number = number / 10;
        }
        return sumOfEvenDigit;
    }
}
