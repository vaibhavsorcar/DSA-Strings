class Solution {
    public String reverseWords(String s) {
     StringBuilder reversed = new StringBuilder();
     Stack<String> str = new Stack<>();

     for (String word : s.trim().split("\\s+")) {
            str.push(word);
        } 

    while (!str.isEmpty()) {
            reversed.append(str.pop());
            if (!str.isEmpty()) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
