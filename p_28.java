class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (len == 0) return 0;
        for (int i = 0; i <= haystack.length() - len; i++) {
        	String aux = haystack.substring(i, i + len);
        	if (aux.equals(needle)) return i;
        }
        return -1;
    }
}
