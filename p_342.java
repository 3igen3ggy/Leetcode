class Solution {
    public boolean isPowerOfFour(int n) {
        if ((int) (Math.log(n) / Math.log(4)) == (Math.log(n) / Math.log(4))) return true;
        return false;
    }
}
