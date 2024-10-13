class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) 
          return false;

        int[] indexS = new int[256]; // For ASCII characters
        int[] indexT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) return false; 
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
