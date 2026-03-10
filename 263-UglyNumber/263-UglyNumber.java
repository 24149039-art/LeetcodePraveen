// Last updated: 3/10/2026, 3:00:01 PM
public class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        int[] primes = {2,3,5};
        for (int p : primes)  {
            while (n % p == 0)  {
                n /= p;


            }
        }
        return n ==1; 
    }
}