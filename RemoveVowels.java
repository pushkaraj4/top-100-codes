import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newStr = removeVowels(str);
        System.out.println(newStr);
        sc.close();
    }

    static String removeVowels(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char lowercase = Character.toLowerCase(str.charAt(i));
            if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u') {
                continue;
            }
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
}
