class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map < Character, Integer > magMap = new HashMap < > ();
        for (char c: magazine.toCharArray()) {
            int newCount = magMap.getOrDefault(c, 0) + 1;
            magMap.put(c, newCount);
        }
        for (char c: ransomNote.toCharArray()) {
            int newCount = magMap.getOrDefault(c, 0) - 1;
            if (newCount < 0)
                return false;
            magMap.put(c, newCount);
        }
        return true;
    }
}