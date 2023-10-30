import java.util.Scanner;
/**
 * 6. Write a program in Java to display the pattern like a triangle with
 * a number. For eg.
 * Input number of rows: 10
 */
public class Programme6_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Row number: ");
        int row = scanner.nextInt();
        triangle(row);
        scanner.close();

    }

    /**
     * static method triangle
     * @param row
     */

    public static void triangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
