import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println(reversed);
        sc.close();
    }

    static String reverseString(String str) {
        // using StringBuffer
        StringBuffer reversed = new StringBuffer(str);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            reversed.setCharAt(i, str.charAt(j));
            reversed.setCharAt(j, str.charAt(i));
            i++;
            j--;
        }
        return reversed.toString();
    }
}