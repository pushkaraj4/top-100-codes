import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = countVowels(str);
        System.out.println(count);
        sc.close();
    }

    static int countVowels(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char lowercase = Character.toLowerCase(str.charAt(i));
            if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u') {
                cnt++;
            }
        }
        return cnt;
    }
}
