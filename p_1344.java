class Solution {
    public double angleClock(int hour, int minutes) {
    	double mang = (minutes * 6) % 360;
    	double hang = (hour * 30 + minutes / (double) 2) % 360;
    	double aux = Math.abs(mang - hang);
    	if (aux > 180) return 360 - aux;
    	else return aux;
    }
}
