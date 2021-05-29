import java.util.ArrayList;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = pos(matrix);

        for (int k = 0; k < list.size(); k++) {
            int ii = list.get(k).get(0);
            int jj = list.get(k).get(1);

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][jj] = 0;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[ii][j] = 0;
            }
        }
    }

    public List<List<Integer>> pos(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> xy = new ArrayList<>();
                    xy.add(i);
                    xy.add(j);
                    list.add(xy);
                    System.out.println("i: " + i + ", j: " + j);
                }
            }
        }
        return list;
    }
}
