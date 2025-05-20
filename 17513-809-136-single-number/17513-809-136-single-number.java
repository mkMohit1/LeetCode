import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer,Integer> result = new HashMap<>();
       for(int num : nums){
            result.put(num, result.getOrDefault(num,0)+1);
       } 

        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            if(entry.getValue()%2!=0){
                return entry.getKey();
            }
        }
        return 0;
    }
}