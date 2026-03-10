// Last updated: 3/10/2026, 3:00:05 PM
class Solution {
    private static final int[] cache = new int[256];
    private static boolean built = false;

    private void build() {
        for (int i = 0; i < 256; i++) {
            int x = i, r = 0;
            for (int j = 0; j < 8; j++) {
                r <<= 1;
                r |= (x & 1);
                x >>= 1;
            }
            cache[i] = r;
        }
        built = true;
    }

    public int reverseBits(int n) {
        if (!built) build();
        return (cache[n & 255] << 24) |
               (cache[(n >>> 8) & 255] << 16) |
               (cache[(n >>> 16) & 255] << 8) |
               cache[(n >>> 24) & 255];
    }
}
