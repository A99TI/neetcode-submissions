class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        ##check rows
        for i in range(9):
            seen = set()
            for x in range(9):
                val = board[i][x]
                if val.isdigit():
                    if val in seen:
                        return False
                    seen.add(val)
        
        ##check columns
        for i in range(9):
            seen = set()
            for x in range(9):
                val = board[x][i]
                print(val)
                if val.isdigit():
                    if val in seen:
                        return False
                    seen.add(val)


        ## check 3x3 sub-boxes
        for box_row in range(0, 9, 3):
            for box_col in range(0, 9, 3):
                seen = set()
                for r in range(box_row, box_row + 3):
                    for c in range(box_col, box_col + 3):
                        val = board[r][c]
                        if val.isdigit():
                            if val in seen:
                                return False
                            seen.add(val)


        return True