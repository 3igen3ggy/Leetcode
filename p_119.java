import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> list = new ArrayList<Integer>();
    	List<List<Integer>> genList = new ArrayList<List<Integer>>();
    	int numRows = rowIndex + 1;
    	if (numRows == 1) {
    		list = new ArrayList<Integer>();
    		list.add(1);
    		return list;
    	}
    	if (numRows == 2) {
    		list = new ArrayList<Integer>();
    		list.add(1);
    		list.add(1);
    		return list;
    	}
    	
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
	    	if (i > 2 && i != numRows) {
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
	    	if (i == numRows) {
	    		list.clear();
	    		list.add(1);
	    		for (int j = 0; j < genList.get(i - 2).size() - 1; j++) {
	    			list.add(genList.get(i - 2).get(j) + genList.get(i - 2).get(j + 1));
	    		}
	    		list.add(1);
	    		return list;

	    	}
    	}
        return list;
    }
}
