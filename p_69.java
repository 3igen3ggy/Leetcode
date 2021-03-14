class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while (true) {
        	if (i * i > x) {
        		return i - 1;
        	} else if (i * i == x) {
                return i;
            } else if (i * i >= 2147395600) {
            	return 46340;
            }
        i++;
        }
    }
}
