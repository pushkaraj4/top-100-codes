import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = toggleChars(str);
        System.out.println(newStr);
        sc.close();
    }

    static String toggleChars(String str) {
        String ans = "";

        // method 1 - using ASCII values
        // char[] str1 = str.toCharArray();
        // for (int i = 0; i < str.length(); i++) {
        //     if (str1[i] >= 'A' && str1[i] <= 'Z') {
        //         ans = ans + Character.toLowerCase(str1[i]);
        //     }
        //     else {
        //         ans = ans + Character.toUpperCase(str1[i]);
        //     }
        // }

        // method 2 - using uppercase and lowercase methods
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans = ans + Character.toLowerCase(str.charAt(i));
            }
            else {
                ans = ans + Character.toUpperCase(str.charAt(i));
            }
        }
        return ans;
    }
}