import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 */
public class Programme12_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is Prime number");
        } else {
            System.out.println(number + " is not Prime number");
        }
        scanner.close();
    }

    /**
     * static method for input number is prime or not
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
