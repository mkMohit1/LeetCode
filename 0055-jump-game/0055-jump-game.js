/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
   let maxjump =0;
    for(var i=0;i<nums.length;i++){
        if(i>maxjump){
            return false;
        }
    maxjump = Math.max(maxjump, i+ nums[i]);
        if(maxjump >=nums.length-1){
            return true;
        }
    }
    return false;
};