// Last updated: 3/10/2026, 2:59:23 PM
public class Solution {
    public int findClosest(int x, int y, int z) {
        int dist1 = Math.abs(x - z);
        int dist2 = Math.abs(y - z);
        if (dist1 < dist2) {
            return 1;
        } else if (dist1 > dist2) {
            return 2;
        } else {
            return 0;
        }
    }
}
