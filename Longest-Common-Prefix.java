class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        StringBuilder prefix = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) break;
            prefix.append(first.charAt(i));
        }
        return prefix.toString();
    }
}
