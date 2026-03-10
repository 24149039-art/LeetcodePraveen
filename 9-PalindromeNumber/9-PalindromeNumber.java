// Last updated: 3/10/2026, 3:00:17 PM
class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int org=x;
        if(x<0) return false;
        while(x!=0){
            int f=x%10;
            r=r*10+f;
            x/=10;
        }
        return org==r?true:false;
        
    }
}