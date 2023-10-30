import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to
 * the method, using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * . NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme7_FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number: ");
        int num = scanner.nextInt();
        int sum = sumFirstAndLastDigit(num);
        System.out.println("Sum of Firstdigit and lastdigit is :" + sum);
        scanner.close();
    }

    /**
     * static methode for sum of first anf last input digit
     * @param number
     * @return
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastdigit = (int) (number % 10);
        int digit;
        int firstdigit = 0;
        while (number > 0) {
            digit = number % 10;
            if ((number / 10) == 0) {
                firstdigit = digit;
            }
            number = number / 10;
        }
        return firstdigit + lastdigit;
    }
}
