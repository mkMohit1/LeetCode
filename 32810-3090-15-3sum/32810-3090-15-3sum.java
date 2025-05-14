import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right =nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                List<Integer> temp = new ArrayList<>();
                   if(nums[i] + nums[left]+ nums[right]==0 && left<right){
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                   }
                   else if(nums[i] + nums[left]+ nums[right]<0){
                    left++;
                   }
                   else if(nums[i] + nums[left]+ nums[right]>0){
                    right--;
                   }
            }
        }
        return result;
    }
}