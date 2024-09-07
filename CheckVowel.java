/*
Take character input from the user
Check if Input is a lowercase of upper case vowel
If yes then print vowel
If not then print consonant
Can also additional check if it’s a non-character item
 */
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int isTrue = isVowel(ch);
        if (isTrue == 1) System.out.println("Vowel");
        else if (isTrue == -1) System.out.println("Not a character");
        else System.out.println("Consonant");
        sc.close();
    }

    static int isVowel(char ch) {
        if (ch < 'a' || ch > 'z') {
            return -1;
        }
        char lowercase = Character.toLowerCase(ch);
        if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'u' || lowercase == 'o') {
            return 1;
        }
        return 0;
    }
}
