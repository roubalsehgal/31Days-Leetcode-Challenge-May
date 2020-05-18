class Solution {
	public boolean checkInclusion(String p, String s) {
		if (s.isEmpty() || p.length() > s.length()) return false;
		int m = p.length(),
		n = s.length();
		int[] text = new int[26],
		pattern = new int[26];
		for (int i = 0; i < m; i++) {
			text[s.charAt(i) - 'a']++;
			pattern[p.charAt(i) - 'a']++;
		}
		for (int i = m; i < n; i++) {
			if (Arrays.equals(text, pattern)) return true;
			text[s.charAt(i) - 'a']++;
			text[s.charAt(i - m) - 'a']--;
		}
		return Arrays.equals(text, pattern);
	}
}