import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1) return 1;

        Set<Integer> pairXor = new HashSet<>();

        // Compute all unique pair XORs
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor.add(nums[i] ^ nums[j]);
            }
        }

        BitSet ans = new BitSet();

        // Form triplets
        for (int x : pairXor) {
            for (int num : nums) {
                ans.set(x ^ num);
            }
        }

        return ans.cardinality();
    }
}