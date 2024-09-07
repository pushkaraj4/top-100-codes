import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String noSpace = removeSpaces(str);
        System.out.println(noSpace);
        sc.close();
    }
    
    static String removeSpaces(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
}