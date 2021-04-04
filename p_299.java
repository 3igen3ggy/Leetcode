class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < len; i++) {
        	if (secret.charAt(i) == guess.charAt(i)) {
        		bulls++;
        		secret = cutOut(secret, i);
        		guess = cutOut(guess, i);
        		len--;
        		i--;
        	}
        }       
        for (int i = 0; i < len; i++) {
        	for(int j = 0; j < len; j++) {
        		if (secret.charAt(i) == guess.charAt(j)) {
        			cows++;
            		secret = cutOut(secret, i);
            		guess = cutOut(guess, j);
                	i--;
                	j--;
                	len--;
                	break;
            	}
            }
         }
        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
    
    public String cutOut(String str, int d) {
    	return str.substring(0, d).concat(str.substring(d + 1));
    }
}
