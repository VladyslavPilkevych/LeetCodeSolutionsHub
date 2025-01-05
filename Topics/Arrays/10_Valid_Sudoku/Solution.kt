class Solution {
    fun areAllValuesDifferent(values: List<Int>): Boolean {
        return values.size == values.toSet().size
    }
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for(row in 0..8) {
            val rowsList = mutableListOf<Int>()
            val columnsList = mutableListOf<Int>()
            for(column in 0..8) {
                if(board[row][column] != '.') {
                    rowsList.add(board[row][column].digitToInt())
                }
                if(board[column][row] != '.') {
                    columnsList.add(board[column][row].digitToInt())
                }
            }
            if(!areAllValuesDifferent(rowsList)) {
                return false
            }
            if(!areAllValuesDifferent(columnsList)) {
                return false
            }
        }

        for(startRow in 0..8 step 3) {
            for(startColumn in 0..8 step 3) {
                val list = mutableListOf<Int>()

                for(row in startRow until startRow + 3) {
                    for(column in startColumn until startColumn + 3) {
                        if(board[row][column] != '.') {
                            list.add(board[row][column].digitToInt())
                        }
                    }
                }

                if(!areAllValuesDifferent(list)) {
                    return false
                }
            }
        }
        return true
    }
}
