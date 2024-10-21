class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;
        if (A.isEmpty()) return true;
        for (int i = 0; i < A.length(); i++) {
            if (isRotated(A, B, i)) return true;
        }
        return false;
    }
    
    private boolean isRotated(String A, String B, int rotation) {
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt((i + rotation) % B.length())) return false;
        }
        return true;
    }
}
