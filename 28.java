//====== Brute Force Solution Time Complexity O(n*(sizeofInteger)) ======//

class Solution {
	public int[] countBits(int num) {
		int[] res = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			res[i] = countOnes(i);
		}
		return res;
	}

	private static int countOnes(int n) {
		int count = 0;
		int mask = 1;
		while (n != 0) {
			if ((n & mask) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
}

//====== Optimised Solution Time Complexity O(n) ======//

class Solution {
	public int[] countBits(int num) {
		int[] res = new int[num + 1];
		res[0] = 0;

		for (int i = 1; i <= num; i++) {
			if ((i & 1) == 0) {
				res[i] = res[i >> 1];
			} else {
				res[i] = res[i - 1] + 1;
			}
		}

		return res;
	}
}