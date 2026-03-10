// Last updated: 3/10/2026, 2:59:58 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n<=0) return false;
        while (n%4==0) {
            n/=4;
        }
        return n==1;
    }
}