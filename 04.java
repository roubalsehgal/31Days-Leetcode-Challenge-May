class Solution {
	public int findComplement(int num) {
		int temp = num;
        
		// count total bits
		int count = 0;
		while (temp != 0) {
			count++;
			temp >>= 1;
		}
        
        // make mask and XOR with num
		int ans = ((1 << count) - 1) ^ num;
		return ans;
	}
}
