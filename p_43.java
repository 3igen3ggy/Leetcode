class Solution {
    public String multiply(String n1, String n2) {
    	if (n1.equals("0") || n2.equals("0")) return "0";
    	if (n1.equals("1")) return n2;
    	if (n2.equals("1")) return n1;
    	if (n1.length() < n2.length()) return multiply(n2, n1);
        String sol = "";
        String[] rows = new String[n2.length()];
        int memo = 0;
        
        for (int i = n2.length() - 1; i >= 0; i--) {
        	for (int j = n1.length() - 1; j >= 0; j--) {
        		int mult = digit(n1, j) * digit(n2, i) + memo;
        		sol = addInfront(sol, String.valueOf(mult % 10));
        		memo = mult / 10;
        	}
        	if (memo != 0) sol = addInfront(sol, String.valueOf(memo)); memo = 0;
     
        	rows[i] = sol;
        	sol = "";
        }
        if (memo != 0) sol = addInfront(sol, String.valueOf(memo));
        addZeros(rows);
        sol = sumUp(rows);
        return sol;
    }
    
    public String sumUp(String[] arr) {
    	String sum = "";
    	for (int i = 0; i < arr.length; i++) {
    		sum = add(sum, arr[i]);
    	}
    	return sum;
    }
    
    public void addZeros(String[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = arr.length - 1 - i; j > 0; j--) {
    			arr[i] += "0";
    		}
    	}
    }
    
    public String add(String n1, String n2) {
    	if (n1.length() < n2.length()) return add(n2, n1);
    	int memo = 0;
    	String sol = "";
    	
    	int diff = Math.abs(n1.length() - n2.length());
    	for (int i = n1.length() - 1; i >= 0; i--) {
    		int n2d = 0;
    		int j = i - diff;
    		if (j >= 0) n2d = digit(n2, j);
    		int sum = digit(n1, i) + n2d + memo;
    		sol = addInfront(sol, String.valueOf(sum % 10));
    		memo = sum / 10;
    	}
    	if (memo != 0) sol = addInfront(sol, String.valueOf(memo));
    	return sol;  	
    }
    
    public int digit(String num, int d) {
    	return Integer.parseInt(String.valueOf(num.charAt(d)));
    }
    
    public String addInfront(String a, String b) {
    	String aux = "";
    	aux = b.concat(a);
    	return aux;
    }
}
