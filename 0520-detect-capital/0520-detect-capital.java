class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0 ;
        for(char ch : word.toCharArray())
            {
                if(Character.isUpperCase(ch))
                {
                    uppercase++ ;
                }
            }

            if(uppercase == word.length())
            {
                return true ;
            }
            if(uppercase == 0||uppercase == 1 && Character.isUpperCase(word.charAt(0)))
            {
                return true ;
            }
    return false ;
    }
}