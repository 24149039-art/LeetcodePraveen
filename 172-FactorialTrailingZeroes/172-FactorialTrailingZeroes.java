// Last updated: 3/10/2026, 3:00:07 PM
class Solution {
    public int trailingZeroes(int n) {
            int count=0;
            while(n!=0){
                n/=5;
                count+=n;
            }
            return count;
        
    }   
}