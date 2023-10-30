import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 */
public class Programme15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();
        leftSideTriangle(row);
        input.close();
    }

    /**
     * static method for left side triangle
     * @param row
     */
    public static void leftSideTriangle(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
