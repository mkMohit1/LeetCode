class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> result = new HashMap<>();
       for(int num : nums){
            result.put(num, result.getOrDefault(num,0)+1);
       } 

        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;   
    }
}