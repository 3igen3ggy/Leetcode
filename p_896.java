class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if (len == 1) return true;
    	for (int i = 0; i < len - 1; i++) {
    		if (A[i] > A[i + 1]) break;
    		if (i == len - 2) return true;
    	}
    	for (int i = 0; i < len - 1; i++) {
    		if (A[i] < A[i + 1]) break;
    		if (i == len - 2) return true;
    	}
    	return false;
    }
}
