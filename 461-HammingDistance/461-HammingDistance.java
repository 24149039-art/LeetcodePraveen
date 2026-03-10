// Last updated: 3/10/2026, 2:59:54 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int n = x ^ y, c = 0;
        while (n > 0) {
            n &= n - 1;
            c++;
        }
        return c;
    }
}
