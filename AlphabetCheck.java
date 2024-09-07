/*
Get user input
Check if input is between ‘A'(65) – ‘Z'(90) or between ‘a'(96) – ‘z'(122)
If True print ‘Yes’
If False print ‘No’
 */

import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        boolean isAlphabet = checkAlphabet(ch);
        if (isAlphabet == true) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

    static boolean checkAlphabet(char ch) {
        char lowercase = Character.toLowerCase(ch);
        if (lowercase >= 'a' && lowercase <= 'z') {
            return true;
        }
        return false;
    }
}
