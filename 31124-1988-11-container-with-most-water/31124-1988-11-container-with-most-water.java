class Solution {
    public int maxArea(int[] height) {
        if(height.length==0){
            return 0;
        }
        int maxStore=0, i=0,j=height.length-1;
        while(i<j){
            int currentStore =0;
            currentStore = Math.min(height[i], height[j]) * (j - i);
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
            else if(height[i]==height[j]){
                j--;
                i++;
            }
            //System.out.println(currentStore);
            if(currentStore>maxStore){
                maxStore = currentStore;
            }
        }
        return maxStore;
    }
}