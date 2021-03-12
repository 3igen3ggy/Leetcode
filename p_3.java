class Solution {
    public int lengthOfLongestSubstring(String s) {
    	String aux = "";
    	int max = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		int is = isIn(aux, c);
    		if (is != -1) {
    			aux = aux.substring(is + 1);
    			aux = aux.concat(String.valueOf(c));
    		} else if (is == -1) {
    			aux = aux.concat(String.valueOf(c));
    		}
    		int auxl = aux.length();
    		if (auxl > max) {
    			max = auxl;
    		}
    	}
    	return max;
    }
    
    public int isIn(String s, char c) {
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == c) return i;
    	}
    	return -1;
    }
}
