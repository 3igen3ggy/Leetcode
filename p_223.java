class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = 0;
        area += (C - A) * (D - B);
        area += (G - E) * (H - F);
        int left =  Math.max(A, E); 
        int right =  Math.min(C, G);  
        int bottom =  Math.max(B, F);
        int top =  Math.min(D, H);
        if(right > left && top > bottom) {
        	area -= (right - left) * (top - bottom);
        }
        return area;
    }
}
