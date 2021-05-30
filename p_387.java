class Solution {
    public int firstUniqChar(String s) {
        int j;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            boolean flag = false;

            for (j = 0; j < s.length(); j++) {
                if (i != j && a == s.charAt(j)) {
                    flag = true;
                    break;
                }
                if (j == s.length() - 1 && !flag) return i;
            }

        }
        return -1;
    }
}
