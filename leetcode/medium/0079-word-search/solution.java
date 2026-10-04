class Solution {

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word,
                        int i, int j, int index) {

        // Word is completely found
        if (index == word.length()) {
            return true;
        }

        // Outside board
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }

        // Character doesn't match
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Try 4 directions
        boolean found =
            dfs(board, word, i - 1, j, index + 1) ||  // up
            dfs(board, word, i + 1, j, index + 1) ||  // down
            dfs(board, word, i, j - 1, index + 1) ||  // left
            dfs(board, word, i, j + 1, index + 1);     // right

        // Backtrack
        board[i][j] = temp;

        return found;
    }
}