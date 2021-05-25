class Solution {
    public int numDupDigitsAtMostN(int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (isRepDig(i)) counter++;
        }
        return counter;
    }

    public boolean isRepDig(int n) {
        boolean[] digits = new boolean[10];

        for (int i = 0; i < (int) Math.log10(n) + 1; i++) {
            String aux = String.valueOf(n);
            if (digits[Integer.parseInt(String.valueOf(aux.charAt(i)))]) return true;
            else digits[Integer.parseInt(String.valueOf(aux.charAt(i)))] = true;
        }
        return false;
    }
}
