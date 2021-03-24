class Solution {
    public boolean isPalindrome(String s) {
    	String aux = "";
    	for (int i = 0; i < s.length(); i++) {
    		if (Character.isLetterOrDigit((s.charAt(i)))) {
    			aux = aux.concat(String.valueOf(s.charAt(i)));
    		}
    	}
    	int len = aux.length();
        aux = aux.toLowerCase();
    	for (int i = 0; i < len / 2; i++) {
    		if (aux.charAt(i) != aux.charAt(len - 1 - i)) {
    			return false;
    		}
    	}
    	return true;
    }
}
