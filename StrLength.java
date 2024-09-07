public class StrLength {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String str = "Pushkaraj";
        int len = 0;
        for (char c : str.toCharArray()) len++;
        System.out.println(len);
    }
}
