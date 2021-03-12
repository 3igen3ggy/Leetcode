class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (strs.length == 0) return "";
    	int minLen = strs[0].length();
    	String pref = "";
    	for (int i = 1; i < len; i++) {
    		int aux = strs[i].length();
    		if (aux < minLen) minLen = aux;
    	}
    	if (minLen == 0) return "";
    	for (int i = 0; i < minLen; i++) {
    		char c = strs[0].charAt(i);
    		int counter = 1;
    		for (int j = 1; j < len; j++) {
    			if (c == strs[j].charAt(i)) counter++;
    			else return pref;
    		}
    		if (counter == len) pref = pref.concat(String.valueOf(c));
    	}
    	return pref;
    }
}
