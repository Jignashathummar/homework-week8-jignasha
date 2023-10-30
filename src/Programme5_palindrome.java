import java.util.Scanner;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it
 * should return false. Check the tips below for more info about palindromes.
 * NOTE: The method isPalindrome needs to be defined as public static
 */
public class Programme5_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scanner.nextInt();
        boolean b = isPalindrome(num);
        System.out.println(b);
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int reversedNum = 0, remainder;
        int originalNum = number;

        while (number != 0) {
            remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
        if (originalNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
