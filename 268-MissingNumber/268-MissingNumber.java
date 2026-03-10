// Last updated: 3/10/2026, 3:00:00 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) sum -= num;
        return sum;
    }
}
