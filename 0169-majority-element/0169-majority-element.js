/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort((a,b)=>a-b);
    let temp=1, count=0, current=nums[0], element=nums[0], position=0;
    for(var i=1;i<nums.length;i++){
        if(current==nums[i]){
            temp++;
            if(count<temp){
                position=i;    
            }
            
        }else{
            if(count<temp){
                count=temp;  
            }
            temp=1;
            current = nums[i];
        }
    }
    return nums[position];
};