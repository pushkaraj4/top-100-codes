import java.util.Scanner;

public class RemoveAllButAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String withoutChars = removeAllButAlphabets(str);
        System.out.println(withoutChars);
        sc.close();
    }
    
    static String removeAllButAlphabets(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
}
