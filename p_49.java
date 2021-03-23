import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<String> list = new ArrayList<String>();
    	List<List<String>> bigList = new ArrayList<List<String>>();
    	
    	int len = strs.length;
    	boolean[] checkList = new boolean[len];
    	for (int i = 0; i < len; i++) {
    		if (!checkList[i]) {
        		checkList[i] = true;
        		list.add(strs[i]);
        		for (int j = i; j < len; j++) {
        			if (!checkList[j]) {
        				if (isAnagram(strs[i], strs[j])) {
            				list.add(strs[j]);
            				checkList[j] = true;
            			}
        			}
        		}
        		List<String> clone = new ArrayList<String>(list);
        		list.clear();
        		bigList.add(clone);
    		}
    	}
    	return bigList;        
    }
    
    public boolean isAnagram(String a, String b) {
    	int lena = a.length();
    	int lenb = b.length();
    	
    	if (lena != lenb) {
    		return false;
    	}
    	boolean[] letters = new boolean[lena];
    	
    	for (int i = 0; i < lena; i++) {
    		if (findLet(a.charAt(i), b, letters) == -1) {
    			return false;
    		}
    	}
    	for (int i = 0; i < lena; i++) {
    		if (!letters[i]) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public int findLet(char c, String s, boolean[] bool) { 
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == c && bool[i] == false) {
    			bool[i] = true;
    			return i;
    		}
    	}
    	return -1;
    }
}
