class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(Integer.parseInt(String.valueOf(num)), 7);
    }
}
