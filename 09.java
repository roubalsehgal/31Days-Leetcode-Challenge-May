class Solution {
	public boolean isPerfectSquare(int num) {
		double sr = Math.sqrt(num);
		return ((sr - Math.floor(sr)) == 0);
	}
}