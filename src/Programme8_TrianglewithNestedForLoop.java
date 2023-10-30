import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 */
public class Programme8_TrianglewithNestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Row number: ");
        int row = scanner.nextInt();
        triangle(row);
        scanner.close();
    }

    public static void triangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
