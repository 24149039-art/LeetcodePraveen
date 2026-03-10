// Last updated: 3/10/2026, 3:00:03 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && ((n&(n-1))==0));

        
    }
}