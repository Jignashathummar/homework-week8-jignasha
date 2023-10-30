import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Programme14_Pattern_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        diamond(num);
        scanner.close();
    }

    /**
     * static method for draw diamond
     * @param num
     */
    public static void diamond(int num) {
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = num - 1;
        while (i >= 1) {
            int j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
