import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        char[] reversed = reverseString(str);
        System.out.println(reversed);
        sc.close();
    }

    static char[] reverseString(String str) {
        // using character array
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length / 2; i++) {
            char temp = str1[i];
            str1[i] = str1[str1.length - 1 - i];
            str1[str1.length - 1 - i] = temp;
        }
        
        // using StringBuffer
        // StringBuffer reversed = new StringBuffer(str);
        // int i = 0;
        // int j = str.length() - 1;
        // while (i < j) {
        //     reversed.setCharAt(i, str.charAt(j));
        //     reversed.setCharAt(j, str.charAt(i));
        //     i++;
        //     j--;
        // }
        // return reversed.toString();
        return str1;
    }
}