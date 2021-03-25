class Solution {
    public boolean isPowerOfTwo(int n) {
        double a = Math.log(n) / Math.log(2);
        int b = (int) a;
        double rounding = 1e-10;
        if (a < b + rounding && a > b - rounding) {
        	return true;
        } else {
        	return false;
        }
    }
}
