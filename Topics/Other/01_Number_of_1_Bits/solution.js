/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    const binary = n.toString(2);
    const result = binary.split("").filter(char => char === "1").length;
    return result;
};

// const numArray = n.toString().split("");
// let p = 1;
// let result = 0;
// for (let i = numArray.length - 1; i >= 0; i--) {
//     result += !!numArray[i] ? p++ : 0;
// }
// return result;
