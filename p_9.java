class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
        	return false;
        }
        int i = 0;
        int d = digits(x);
    	while (i < d) {
    		if (digit(x, i) != digit(x, d - 1 - i)) {
    			return false;
    		}
    		i++;
    	}
    	return true;
    }
    
    public int digit(int x, int d) {
    	String aux = String.valueOf(x);
    	return Integer.parseInt(String.valueOf(aux.charAt(d)));
    }
    
    public int digits(int n) {
    	return (int) Math.log10(n) + 1;
    }
}
