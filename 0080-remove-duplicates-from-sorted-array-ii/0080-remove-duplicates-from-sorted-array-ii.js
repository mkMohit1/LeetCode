/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  let count = 0;
for (let j = 0; j < nums.length; j++) {
    count = 0;
    for (let i = j + 1; i < nums.length; i++) {
        if (nums[j] === nums[i]) {
            count++;
            if (count > 1) {
                nums.splice(i, 1); // Remove duplicate element
                i--; // Adjust index after splicing
            }
        }
    }
}
    return nums.length;
};
