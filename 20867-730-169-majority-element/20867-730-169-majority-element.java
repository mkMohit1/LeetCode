class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> result = new HashMap<>();
       for(int num : nums){
            result.put(num, result.getOrDefault(num,0)+1);
       } 
        int count=0, value=0;
        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            if(entry.getValue()>count){
                count = entry.getValue();
                value = entry.getKey(); 
            }
        }
        return value;
    }
}