import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
        sc.close();
    }

    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                continue;
            }
            else {
                 return false;
            }
        }
        return true;
    }
}
