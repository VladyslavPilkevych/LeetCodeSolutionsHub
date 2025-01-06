/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    const MAX_LENGTH = matrix.length - 1;
    for (let circles = 0; circles < Math.floor(matrix.length / 2); circles++) {
        let buffer1 = 0;
        let buffer2 = 0;

        buffer1 = matrix[circles][MAX_LENGTH - circles];
        matrix[circles][MAX_LENGTH - circles] = matrix[circles][circles];
        buffer2 = matrix[MAX_LENGTH - circles][MAX_LENGTH - circles];
        matrix[MAX_LENGTH - circles][MAX_LENGTH - circles] = buffer1;
        buffer1 = matrix[MAX_LENGTH - circles][circles];
        matrix[MAX_LENGTH - circles][circles] = buffer2;
        matrix[circles][circles] = buffer1;

        for (let matrixRow = circles + 1; matrixRow < (MAX_LENGTH - circles); matrixRow++) {
            buffer1 = matrix[matrixRow][MAX_LENGTH - circles];
            matrix[matrixRow][MAX_LENGTH - circles] = matrix[circles][matrixRow];

            buffer2 = matrix[MAX_LENGTH - matrixRow][circles];
            matrix[MAX_LENGTH - matrixRow][circles] = matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow];
            
            matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow] = buffer1;
            matrix[circles][matrixRow] = buffer2;            
        }
    }
};

// ----------------------------------------------------------------

// const test_matrix = [[1,2,3],
//                      [4,5,6],
//                      [7,8,9]];

// const test_matrix = [[1,2,3,4],
//                      [5,6,7,8],
//                      [9,10,11,12],
//                      [13,14,15,16]];

// const test_matrix = [[1,2,3,4,5],
//                      [6,7,8,9,10],
//                      [11,12,13,14,15],
//                      [16,17,18,19,20],
//                      [21,22,23,24,25]];

// function rotateMatrix(matrix) {
//     console.table(matrix);
//     const MAX_LENGTH = matrix.length - 1;
//     for (let circles = 0; circles < Math.floor(matrix.length / 2); circles++) {
//         let buffer1 = 0;
//         let buffer2 = 0;

//         buffer1 = matrix[circles][MAX_LENGTH - circles];
//         matrix[circles][MAX_LENGTH - circles] = matrix[circles][circles];
//         buffer2 = matrix[MAX_LENGTH - circles][MAX_LENGTH - circles];
//         matrix[MAX_LENGTH - circles][MAX_LENGTH - circles] = buffer1;
//         buffer1 = matrix[MAX_LENGTH - circles][circles];
//         matrix[MAX_LENGTH - circles][circles] = buffer2;
//         matrix[circles][circles] = buffer1;

//         console.log(circles + 1, (MAX_LENGTH - circles))

//         for (let matrixRow = circles + 1; matrixRow < (MAX_LENGTH - circles); matrixRow++) {
//             console.log(matrixRow);
//             buffer1 = matrix[matrixRow][MAX_LENGTH - circles];
//             matrix[matrixRow][MAX_LENGTH - circles] = matrix[circles][matrixRow];

//             buffer2 = matrix[MAX_LENGTH - matrixRow][circles];
//             matrix[MAX_LENGTH - matrixRow][circles] = matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow];

//             matrix[MAX_LENGTH - circles][MAX_LENGTH - matrixRow] = buffer1;
//             matrix[circles][matrixRow] = buffer2;            
//         }
//     }
//     console.table(matrix);
// }

// rotateMatrix(test_matrix);
