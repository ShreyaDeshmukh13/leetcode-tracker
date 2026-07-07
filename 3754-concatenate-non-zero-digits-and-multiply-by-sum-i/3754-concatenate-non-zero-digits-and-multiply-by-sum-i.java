class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder s = new StringBuilder(String.valueOf(n));
        StringBuilder result = new StringBuilder();

    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                result.append(s.charAt(i));
            }
        }

        
        if (result.length() == 0) {
            return 0;
        }

        
        int x = Integer.parseInt(result.toString());

    
        int sum = sumofdigits(x);

    
        return (long) x * sum;
    }

    public int sumofdigits(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }
}