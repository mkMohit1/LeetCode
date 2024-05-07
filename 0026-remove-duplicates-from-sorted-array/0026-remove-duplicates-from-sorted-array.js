/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let temp = [...new Set(nums)];
    nums.map((a,index)=>{
        if(temp.length<index){
            nums[index] =0;
        }else{
            nums[index]= temp[index];
        }
    });
    return temp.length;
};