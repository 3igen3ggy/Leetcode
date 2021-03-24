import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<Integer> list = new ArrayList<Integer>();
    	List<List<Integer>> genList = new ArrayList<List<Integer>>();
    	
    	for (int i = 1; i <= numRows; i++) {
	    	if (i == 1) {
	    		list.add(1);
	    		List<Integer> copy = new ArrayList<Integer>(list);
	    		genList.add(copy);
	    	}
	    	if (i == 2) {
	    		list.add(1);
	    		List<Integer> copy = new ArrayList<Integer>(list);
	    		genList.add(copy);
	    	}
	    	if (i > 2) {
	    		list.clear();
	    		list.add(1);
	    		for (int j = 0; j < genList.get(i - 2).size() - 1; j++) {
	    			list.add(genList.get(i - 2).get(j) + genList.get(i - 2).get(j + 1));
	    		}
	    		list.add(1);
	    		List<Integer> copy = new ArrayList<Integer>(list);
	    		genList.add(copy);
	    		list.clear();
	    	}
    	}
        return genList;
    }
}
