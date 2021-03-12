class Solution {
    public int myAtoi(String s) {
       
        s = s.trim();
        String aux = "";
        int len = s.length();
        int mult = 1;
        if (len == 0) return 0;
        char c = s.charAt(0);
        if (!Character.isDigit(c) && len == 1) return 0;
        if (Character.isDigit(c) && len == 1) return Integer.parseInt(String.valueOf(c));
        char c1 = s.charAt(1);
        if (c == '-' || c == '+' || Character.isDigit(c1) || Character.isDigit(c)) {
	        if (c == '-') mult = -1;
	        if (!Character.isDigit(c1)) s.substring(1);
	        int i = 0;
	        if (c == '-' || c == '+') i = 1;
	        while (i < len && Character.isDigit(s.charAt(i))) {
	        	aux = aux.concat(String.valueOf(s.charAt(i)));
	        	i++;
	            long num = Long.parseLong(aux) * mult;
	            if (num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
	            if (num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
	        }
        }
        if (aux.length() == 0) return 0;
        return (Integer.parseInt(aux) * mult);
    }
}
