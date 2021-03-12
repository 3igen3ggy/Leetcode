class Solution {
    public String longestPalindrome(String s) {
    	int len = s.length();
    	if (len == 0) return "";
    	String even = evenPalindrome(s);
    	System.out.println("even: " + even);
    	String odd = oddPalindrome(s);
    	System.out.println("odd: " + odd);
    	
    	if (even.length() >= odd.length()) return even;
    	else return odd;
    }
    
    public String evenPalindrome(String s) {
    	int len = s.length();
    	int counter;
    	String aux = "";
    	int max = 0;
    	for (int i = 0; i < len; i++) {
    		counter = 0;
    		int d = 0;
    		while (i - d >= 0 && i + 1 + d < len) {
    			if (s.charAt(i - d) == s.charAt(i + 1 + d)) {
    				counter += 2;
        			if (counter > max) {
        				max = counter;
        				aux = s.substring(i - d, i + d + 2);
        			}
    			} else {
    				break;
    			}
    			d++;
    		}
    	}
    	return aux;
    }
    
    public String oddPalindrome(String s) {
    	int len = s.length();
    	int counter;
    	String aux = String.valueOf(s.charAt(0));
    	int max = 0;
    	for (int i = 1; i < len; i++) {
    		counter = 1;
    		int d = 1;
    		while (i - d >= 0 && i + d < len) {
    			if (s.charAt(i - d) == s.charAt(i + d)) {
    				counter += 2;
        			if (counter > max) {
        				max = counter;
        				aux = s.substring(i - d, i + d + 1);
        			}
    			} else {
    				break;
    			}
    			d++;
    		}
    	}
    	return aux;
    }
}
