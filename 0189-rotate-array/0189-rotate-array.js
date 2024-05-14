/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
let temp2 =k;    
if(k>nums.length){
        temp2 = k%nums.length;
    }
    var temp = nums.splice(nums.length - temp2);
    for(var i=temp.length -1;i>=0;i--){
        nums.unshift(temp[i])
    }
};