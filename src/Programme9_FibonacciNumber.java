import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        fibonacci(num);
        scanner.close();
    }

    /**
     * static method for print fibonacci series
     * @param num
     */
    public static void fibonacci(int num) {
        int num1 = 1, num2 = 1;
        System.out.println("Fibonacci series is: ");
        System.out.print(num1 + " " + num2 + " ");
        while (num1+num2 <= num) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
