// Last updated: 3/10/2026, 2:59:45 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = -1, rookCol = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
        }
        int count = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] dir : directions) {
            int r = rookRow, c = rookCol;
            while (true) {
                r += dir[0];
                c += dir[1];
                if (r < 0 || r >= 8 || c < 0 || c >= 8) break;
                if (board[r][c] == 'B') break;
                if (board[r][c] == 'p') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board1 = {
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','R','.','.','.','p'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}
        };
        System.out.println(sol.numRookCaptures(board1));

        char[][] board2 = {
            {'.','.','.','.','.','.','.'},
            {'.','p','p','p','p','p','.','.'},
            {'.','p','p','B','p','p','.','.'},
            {'.','p','B','R','B','p','.','.'},
            {'.','p','p','B','p','p','.','.'},
            {'.','p','p','p','p','p','.','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}
        };
        System.out.println(sol.numRookCaptures(board2));

        char[][] board3 = {
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'p','p','.','R','.','p','B','.'},
            {'.','.','.','.','.','.','.','.'},
            {'.','.','.','B','.','.','.','.'},
            {'.','.','.','p','.','.','.','.'},
            {'.','.','.','.','.','.','.','.'}
        };
        System.out.println(sol.numRookCaptures(board3));
    }
}