// Last updated: 3/10/2026, 2:59:24 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sum=sum+nums[i];
            }
            else{
                sum1=sum1+nums[i];
            }

        }
        if(sum==sum1){
            return false;
        }
        else{
            return true;
        
        
        }
        
    }
}