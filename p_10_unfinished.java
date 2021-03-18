//s = aaa, p = ab*a*c*a
// c* is problem between a

class Solution {
    public boolean isMatch(String s, String p) {
        if (p.equals(".*")) return true;
        if (p.equals(s)) return true;
        p = repair(p);
        
        int slen = s.length();
        int plen = p.length();
        
        int i = 0;
        int j = 0;
        while (true) {
        	
        	System.out.println("i: " + i + ", j: " + j + ", s.charat(i): " + s.charAt(i) + ", p.charat(j): " + p.charAt(j));
        	if (j < plen - 1 && i < slen && s.charAt(i) != p.charAt(j) && p.charAt(j + 1) != '*' && p.charAt(j) != '.') {
        		System.out.println("aaa");
	        	return false;
        	} else if (j == plen - 2 && p.charAt(j + 1) == '*' && s.charAt(i) == p.charAt(j)) { 
	        	return true;
	        } else if (i != slen - 1 && j >= plen - 1  || i == slen - 1 && j != plen - 1 && p.charAt(j + 1) != '*') {
	        	System.out.println("i: " + i + ", j: " + j + ", s.charat(i): " + s.charAt(i) + ", p.charat(j): " + p.charAt(j));
	        	//tutaj cos!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	        	System.out.println("aaa");
	        	return false;
	        }
	        //final condition
	        if (i == slen - 1 && j == plen - 1) {
	        	return true;
	        }
        	if (plen > 2 && j < plen - 1 && p.charAt(j + 1) == '*') {
        		while (true) {
        			System.out.println("STAR CHECKING, i: " + i + ", j: " + j);
        			if (s.charAt(i) == p.charAt(j)) {
        				i++;
        				System.out.println("i: " + i + ", j: " + j + ", s.charat(i): " + s.charAt(i) + ", p.charat(j): " + p.charAt(j));
        			} else {
        				j += 2;
        				System.out.println("i: " + i + ", j: " + j + ", s.charat(i): " + s.charAt(i) + ", p.charat(j): " + p.charAt(j));
        				break;
        			}
        		}
        	} else if (j < plen && p.charAt(j) == '.') {
	        	i++;
	        	j++;
	        } else if (j < plen && i < slen && s.charAt(i) == p.charAt(j)) {
	        	i++;
	        	j++;
	        } else if (s.charAt(i) != p.charAt(j)) {

	        	return false;
	        }

        }
    }
    
    public String repair(String p) {
    	String aux = p;
    	for (int i = 1; i < p.length() - 1; i++) {
    		int counter = 0;
    		if (p.charAt(i) == '*' && p.charAt(i - 1) == p.charAt(i + 1)) {
    			System.out.println("aaa");
    			int j = i + 1;
    			while (j < p.length()) {
    				if (p.charAt(j) == p.charAt(i - 1)) {
    					counter++;
    					j++;
    				} else {
    					break;
    				}
    			}
    			aux = "";
    			String aux1 = p.substring(0, i + 1);
    			String aux2 = p.substring(i + 1 + counter, p.length());
    			aux = aux1.concat(aux2);
    			
    		}
    	}
    	return aux;
    }
}