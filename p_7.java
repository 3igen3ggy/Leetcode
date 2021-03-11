class Solution {
    public int reverse(int x) {
        boolean positive;
        
        if (x < 0) {
            positive = false;    
        } else {
            positive = true;
        }
        
        x = Math.abs(x);
        
        int aux = 0;
        long check = 0L;
        
        for (int i = 0; i < digits(x); i++) {
            aux += digit(x, i) * Math.pow(10, i);
            check += (long) digit(x, i) * Math.pow(10, i);
        }
        
        if (check > Integer.MAX_VALUE || aux < 0) {
        	return 0;
        }    
        
        if (positive == false) {
            aux *= -1;
        }
        return aux;
    }
    
    public int digit(int n, int d) {
        String aux = String.valueOf(n);
        if (String.valueOf(aux.charAt(d)).equals("-")) {
        	return 0;
        }
        return Integer.parseInt(String.valueOf(aux.charAt(d)));
    }
    
    public int digits(int n) {
        return (int) Math.log10(n) + 1;
    }
}
