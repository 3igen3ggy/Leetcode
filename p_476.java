class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        String aux = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') aux = aux.concat("0");
            else aux = aux.concat("1");
        }
        return Integer.parseInt(aux, 2);
    }
}
