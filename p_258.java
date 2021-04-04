class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        int len = (int) Math.log10(num) + 1;
        int aux = 0;
        while (len != 1) {
            for (int i = 0; i < len;  i++) {
                aux += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }
            num = aux;
            aux = 0;
            len = (int) Math.log10(num) + 1;
        }
        return num;
    }
}
