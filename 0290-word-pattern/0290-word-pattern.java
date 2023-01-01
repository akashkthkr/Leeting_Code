class Solution {
    public boolean wordPattern(String pattern, String s) {
       if (s.length() == 0 ) return false;
        String[] s_words = s.split(" ");

        if (pattern.length() != s_words.length) return false;
        HashMap<Character, String> charStr = new HashMap<>();
        HashMap<String, Character> strChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = s_words[i];
            if (charStr.containsKey(ch)) {
                if (!charStr.get(ch).equals(word)) return false;
            } else {
                charStr.put(ch, word);
            }
            if (strChar.containsKey(word)) {
                if (ch != strChar.get(word)) return false;
            } else {
                strChar.put(word, ch);
            }
        }
        return true;
    }
}