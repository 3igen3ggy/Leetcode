class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");

        String aux = "";
        for (int i = arr.length - 1; i >= 0; i--) {
        	if (!arr[i].equals("")) {
        		aux = aux.concat(arr[i]);
            	aux = aux.concat(" ");
        	}
        }
        aux = aux.trim();
        return aux;
    }
}
