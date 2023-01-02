class Solution {
    public boolean detectCapitalUse(String word) {
        if ( word.length() == 0 ) return false;
        // for( int i = 0; i < word.length(); i++ ) {
        //     int ch = word.charAt(i);
        //     if ( ch <= 90 && ch >= 65 )
        //         continue;
        //     return false;
        // }
        if ( word.toLowerCase().equals(word) ) return true;
        if ( word.toUpperCase().equals(word) ) return true;
        if ( (word.charAt(0) <= 90 && word.charAt(0) >= 65) && word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }
}