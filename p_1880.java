class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = nums(firstWord);
        int b = nums(secondWord);
        int c = nums(targetWord);

        if (a + b == c) return true;
        return false;
    }

    public int nums(String s) {
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num = num.concat(String.valueOf(c - 97));
        }
        return Integer.parseInt(num);
    }
}
