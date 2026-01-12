class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i, k ;
        StringBuffer s = new StringBuffer();
            for(k = 0; k < strs[0].length(); k++)
            {
                char currentChar = strs[0].charAt(k);

                for(i = 1; i < strs.length; i++)
                {
                    if (k >= strs[i].length() || strs[i].charAt(k) != currentChar) 
                    {
                        return s.toString();
                    }
                }
                 s.append(currentChar);
            }
           return s.toString();
    }
}