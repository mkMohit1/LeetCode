/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let count;
    for(let j=0;j<nums.length;j++){
        count =0;
    for(let i=0;i<nums.length;i++ ){
        let temp =null;
        if(nums[i] == val){
            if(i<nums.length-1){
                temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
            }
        }else{
            count++;
        }
    }
    }
return count;
};
