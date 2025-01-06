class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val MAX_LENGTH = matrix.size - 1;
        for (circles in 0 until (matrix.size / 2)) {
            var buffer1 = 0
            var buffer2 = 0

            buffer1 = matrix[circles][MAX_LENGTH - circles]
            matrix[circles][MAX_LENGTH - circles] = matrix[circles][circles]
            buffer2 = matrix[MAX_LENGTH - circles][MAX_LENGTH - circles]
            matrix[MAX_LENGTH - circles][MAX_LENGTH - circles] = buffer1
            buffer1 = matrix[MAX_LENGTH - circles][circles]
            matrix[MAX_LENGTH - circles][circles] = buffer2
            matrix[circles][circles] = buffer1

            for (matrixRow in (circles + 1) until (MAX_LENGTH - circles)) {
                buffer1 = matrix[matrixRow][MAX_LENGTH - circles]
                matrix[matrixRow][MAX_LENGTH - circles] = matrix[circles][matrixRow]

                buffer2 = matrix[MAX_LENGTH - matrixRow][circles]
                matrix[MAX_LENGTH - matrixRow][circles] = matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow]

                matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow] = buffer1
                matrix[circles][matrixRow] = buffer2
            }
        }
    }
}