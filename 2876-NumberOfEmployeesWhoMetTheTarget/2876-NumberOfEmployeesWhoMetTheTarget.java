// Last updated: 3/10/2026, 2:59:28 PM
public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int h : hours) {
            if (h >= target) {
                count++;
            }
        }
        return count;
    }
}
