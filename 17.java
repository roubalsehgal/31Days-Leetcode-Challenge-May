class Solution {
	int[] par = null;
	public List < Integer > findAnagrams(String s, String p) {

		List < Integer > result = new ArrayList < >();
		if (p.length() > s.length() || p.length() == 0 || s.length() == 0) return result;
		par = new int[26];
		int[] temp = new int[26];
		int plength = p.length();

		for (char ch: p.toCharArray()) {
			par[ch - 'a']++;
		}

		for (int i = 0; i < plength - 1; i++) {
			temp[s.charAt(i) - 'a']++;
		}

		for (int i = plength - 1; i < s.length(); i++) {
			temp[s.charAt(i) - 'a']++;
			if (Arrays.equals(temp, par)) {
				result.add(i - plength + 1);
			}
			temp[s.charAt(i - plength + 1) - 'a']--;
		}

		return result;

	}
}