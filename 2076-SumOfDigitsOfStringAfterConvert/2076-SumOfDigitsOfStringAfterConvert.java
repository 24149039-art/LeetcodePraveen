// Last updated: 3/10/2026, 2:59:36 PM
import java.util.*;

public class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }
        int sum = 0;
        for (char c : num.toString().toCharArray()) {
            sum += c - '0';
        }
        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getLucky("iiii", 1));     
        System.out.println(sol.getLucky("leetcode", 2)); 
        System.out.println(sol.getLucky("zbax", 2));    
    }
}