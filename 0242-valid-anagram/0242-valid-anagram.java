import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths don't match, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Build the frequency map using string 's'
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Match and decrement counts using string 't'
        for (char ch : t.toCharArray()) {
            // If character isn't in 's' OR we've used it too many times
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}
