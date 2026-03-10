// Last updated: 3/10/2026, 2:59:35 PM
import java.util.*;

public class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> map = new HashMap<>();
        for (int[] rect : rectangles) {
            int w = rect[0], h = rect[1];
            int gcd = gcd(w, h);
            String ratio = (w / gcd) + "/" + (h / gcd);
            map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
        }
        long res = 0;
        for (long count : map.values()) {
            res += (count * (count - 1)) / 2;
        }
        return res;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}