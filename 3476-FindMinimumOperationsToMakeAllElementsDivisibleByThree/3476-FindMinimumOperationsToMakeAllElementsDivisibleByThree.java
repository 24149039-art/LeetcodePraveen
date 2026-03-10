// Last updated: 3/10/2026, 2:59:21 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }else continue;
        }
        return count;
        
    }
}