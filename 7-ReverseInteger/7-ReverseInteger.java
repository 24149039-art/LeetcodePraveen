// Last updated: 3/10/2026, 3:00:18 PM
class Solution {
    public int reverse(int x) {
        long s=0;
        while(x!=0){
            int f=x%10;
            s=s*10+f;
            x/=10;

        }if(s> Integer.MAX_VALUE || s < Integer.MIN_VALUE){
            return 0;

        } 
        else{
            return (int)s;
        }
    }
}