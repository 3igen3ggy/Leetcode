class Solution {
    public String convert(String s, int numRows) {
    	if (numRows == 1) return s;
        int len = s.length();
        char c;
        int d = 2 * (numRows - 1);
        int d1 = d;
        int d2 = d;
        String aux = "";
        for (int i = 0; i < numRows; i++) {
        	d1 = d - 2 * i;
        	d2 = 2 * i;
        	int j = i;
        	while (j < len) {
            	if (i != numRows - 1) {
    	        	c = s.charAt(j);
    	        	aux = aux.concat(String.valueOf(c));
    	        	j += d1;	        		
            	}
            	if (i != 0 && j < len) {
    	        	c = s.charAt(j);
    	        	aux = aux.concat(String.valueOf(c));
    	       		j += d2;
            	}
            }
        }
        return aux;
    }
}
