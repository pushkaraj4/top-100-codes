import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int value = ASCII(ch);
        System.out.println(value);
        sc.close();
    }

    static int ASCII(char ch) {
        return ch;
    }
}
