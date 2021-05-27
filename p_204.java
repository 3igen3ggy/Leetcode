class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        int counter = 0;
        
        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
                counter++;
                for (int j = i; j < n; j += i) {
                    arr[j] = true;
                }
            }
        }
        return counter;
    }
}
