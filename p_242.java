import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < slen; i++) {
        	if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}
