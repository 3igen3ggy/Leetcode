import java.util.ArrayList;

class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= n / 2; i++) {
        	if (n % i == 0) arr.add(i);
        }
        arr.add(n);
        if (k > arr.size()) return -1;
        return arr.get(k - 1);
    }
}
