class Solution {
	char t1 = '(';
	char t1c = ')';
	char t2 = '[';
	char t2c = ']';
	char t3 = '{';
	char t3c = '}';
    public boolean isValid(String s) {
    	String snew = s;
    		while(snew.length() != 0 || s.equals(snew)) {
    			s = snew;
    			snew = del(s);
    			if (s.equals(snew)) {
    				return false;
    			} else if (s.length() == 0) {
    				return true;
    			}	
    		}
    	return true;  	
    }
    
    public String del(String s) {
    	if (s.length() == 0) return s;
    	for (int i = 0; i < s.length() - 1; i++) { 
    		
    		if (s.charAt(i) == t1 && s.charAt(i + 1) == t1c ||
    				s.charAt(i) == t2 && s.charAt(i + 1) == t2c ||
    				s.charAt(i) == t3 && s.charAt(i + 1) == t3c) {
    			s = remov(s, i + 1);
    			s = remov(s, i); 
    		}
    	}
    	return s;
    }
    
    public String remov(String s, int num) {
    	String aux = "";
    	aux = s.substring(0, num);
    	aux = aux.concat(s.substring(num + 1, s.length()));
    	return aux;
    }
}
