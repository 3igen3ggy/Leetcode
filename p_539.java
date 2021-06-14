class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        
        boolean[] trueAt = new boolean[24 * 60];
        int firstTrueAt = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            int min = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60 
                    + Integer.parseInt(timePoints.get(i).substring(3, 5));
            if(trueAt[min])
                return 0;
            trueAt[min] = true; 
            if(firstTrueAt > min){
                firstTrueAt = min;
            }
        }
        
        int ans = Integer.MAX_VALUE;
        int lastTrueAt = firstTrueAt;
        for(int i = firstTrueAt + 1; i < 24 * 60; i++){
            if(trueAt[i]){
                ans = Math.min(ans, i - lastTrueAt);
                lastTrueAt = i;
            }
        }
        
        ans = Math.min(ans, firstTrueAt +  ((24 * 60) - lastTrueAt));
        
        return ans;
    }
}
