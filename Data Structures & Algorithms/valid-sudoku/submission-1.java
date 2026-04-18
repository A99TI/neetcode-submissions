class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> seen = new HashSet<>();

            for (int column = 0; column < 9; column++) {
                char value = board[row][column];

                if (value != '.') {
                    if (!seen.add(value)) return false;
                }
            }
        }

        // Check columns
        for (int column = 0; column < 9; column++) {
            HashSet<Character> seen = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char value = board[row][column];

                if (value != '.') {
                    if (!seen.add(value)) return false;
                }
            }
        }

        // Check 3x3 boxes
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    char value = board[row][col];

                    if (value != '.') {
                        if (!seen.add(value)) return false;
                    }
                }
            }
        }

        return true;
    }
}
