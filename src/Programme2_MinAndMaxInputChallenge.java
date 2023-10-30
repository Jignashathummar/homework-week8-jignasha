import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme2_MinAndMaxInputChallenge {

    public ArrayList<Integer> maxAndMinValue(Scanner scanner) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        while (true) {
            System.out.println("Please enter the number: ");
            if (scanner.hasNextInt()) {
                numList.add(scanner.nextInt());
            } else {
                break;
            }
        }
        return numList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme2_MinAndMaxInputChallenge p2 = new Programme2_MinAndMaxInputChallenge();
        ArrayList<Integer> numList = p2.maxAndMinValue(scanner);
        System.out.println("Max number is : " + Collections.max(numList));
        System.out.println("Min number is : " + Collections.min(numList));
        scanner.close();
    }
}

