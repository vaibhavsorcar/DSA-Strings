public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = reverseRecursively(s);
        System.out.println(reversed);
    }

    public static String reverseRecursively(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseRecursively(s.substring(1)) + s.charAt(0);
    }
}
