class Solution {
    public int numJewelsInStones(String J, String S) {
        Map < Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
            } else {
                map.put(S.charAt(i), 1);
            }
        }

        int ans = 0;
        for (int p = 0; p < J.length(); p++) {
            if (map.containsKey(J.charAt(p))) {
                ans += map.get(J.charAt(p));
            }
        }
        return ans;
    }
}