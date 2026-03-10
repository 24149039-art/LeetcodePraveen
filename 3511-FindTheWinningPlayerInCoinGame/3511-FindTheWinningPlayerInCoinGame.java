// Last updated: 3/10/2026, 2:59:25 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int t =1;
        while(x>=1&&y>=4){
            x-=1;
            y-=4;
            t ++;
        }
        if(t%2==0){
            return "Alice";
        }
        else{
            return "Bob";
        }
        
    }
}