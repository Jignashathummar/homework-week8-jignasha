import java.util.Scanner;
/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 */
public class Programme10_Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number: ");
        int num = scanner.nextInt();
        boolean res = armstrong(num);
        if (res) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scanner.close();
    }

    /**
     * static method for input number is armstrong or not
     * @param number
     * @return
     */
    public static Boolean armstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber > 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;

        }
        return result == number;
    }
}
