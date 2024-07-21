public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] charArray = s.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        String reversed = new String(charArray);
        System.out.println(reversed);
    }
}
