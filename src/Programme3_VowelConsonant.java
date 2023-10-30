import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print
 * an error message.
 */
public class Programme3_VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the alphabet: ");
        char ch = scanner.next().charAt(0);
        String result = vowelConsonant(ch);
        System.out.println(result);
        scanner.close();
    }

    public static String vowelConsonant(char ch) {
        char lowerCaseCh = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            if (lowerCaseCh == 'a' || lowerCaseCh == 'e' || lowerCaseCh == 'i' || lowerCaseCh == 'o' || lowerCaseCh == 'u') {
                return (ch + " is vowel.");
            } else {
                return (ch + " is consonant");
            }
        } else {
            return "Error: Not a letter (between a and z or A and Z).";
        }
    }
}
