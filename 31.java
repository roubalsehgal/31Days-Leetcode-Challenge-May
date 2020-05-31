class Solution {
	public int minDistance(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		int[][] strg = new int[l1 + 1][l2 + 1];
		strg[l1][l2] = 0;

		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i == s1.length()) {
					strg[i][j] = s2.length() - j;
					continue;
				}
				if (j == s2.length()) {
					strg[i][j] = s1.length() - i;
					continue;
				}
				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = strg[i + 1][j + 1];
				} else {
					strg[i][j] = 1 + Math.min(strg[i + 1][j + 1], Math.min(strg[i + 1][j], strg[i][j + 1]));
				}
			}
		}

		return strg[0][0];
	}
}