/**
 * @param {number[]} nums
 * @return {number}
 */
var subsetXORSum = function(nums) {
   let subsetArray = [];

    if (nums.length === 0) {
        return 0; 
    }

    let totalSubsets = 1 << nums.length;

    for (let i = 0; i < totalSubsets; i++) {
        let subset = [];
        for (let j = 0; j < nums.length; j++) {
            if (i & (1 << j)) {
                subset.push(nums[j]);
            }
        }
        subsetArray.push(subset);
    }
    let count = 0;
    for (let k = 0; k < subsetArray.length; k++) {
        let temp3 = 0;
        for (let i = 0; i < subsetArray[k].length; i++) {
            temp3 ^= subsetArray[k][i];
        }
        count += temp3;
    }
    return count;
};